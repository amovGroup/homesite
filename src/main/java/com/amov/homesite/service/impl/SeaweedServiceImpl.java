package com.amov.homesite.service.impl;

import com.amov.homesite.dto.SeaweedAssignJSON;
import com.amov.homesite.service.SeaweedService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class SeaweedServiceImpl implements SeaweedService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public SeaweedAssignJSON assignFid(String url, HttpMethod method, MultiValueMap<String, String> params) {
        try {
            RestTemplate client = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
            ResponseEntity<SeaweedAssignJSON> response = client.exchange(url, method, requestEntity, SeaweedAssignJSON.class);
            logger.warn(response.getBody().toString());
            return response.getBody();
        } catch (Exception e) {
            logger.error("文件服务器seaweedfs无法连接，检查文件服务器是否在线");
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public String uploadFile(String path, SeaweedAssignJSON json) {
        String fid = json.getFid();
        String url = "http://" + json.getUrl() + "/" + fid;
        try {
            RestTemplate client = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            FileSystemResource resource = new FileSystemResource(new File(path));

            MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
            params.add("file", resource);

            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(params, headers);

            ResponseEntity<String> response = client.exchange(url, HttpMethod.POST, requestEntity, String.class);

            if (response.getStatusCode() != HttpStatus.CREATED) {
                logger.error("上传数据失败了，检查数据是否上传了");
                return "";
            }

            return url;
        } catch (Exception e) {
            logger.error("文件服务器SeaweedFS无法上传，检查文件服务器是否在线");
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String uploadMultipartFile(MultipartFile file, SeaweedAssignJSON json) {
        String tmpPath = "output/temporary/" + file.getOriginalFilename();
        try {
            File tmpFile = new File(tmpPath);
            file.transferTo(tmpFile);
            String res = uploadFile(tmpPath, json);
            tmpFile.delete();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public boolean deleteFile(String url) {
        try {
            RestTemplate client = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(params, headers);

            ResponseEntity<String> response = client.exchange(url, HttpMethod.DELETE, requestEntity, String.class);
            if (response.getStatusCode() != HttpStatus.ACCEPTED) {
                return false;
            }
            return true;
        } catch (Exception e) {
            logger.error("文件服务器seaweedfs无法上传，检查文件服务器是否在线");
            e.printStackTrace();
        }
        return false;
    }
}
