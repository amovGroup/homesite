package com.amov.homesite.service;

import com.amov.homesite.dto.SeaweedAssignJSON;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

public interface SeaweedService {
    SeaweedAssignJSON assignFid(String url, HttpMethod method, MultiValueMap<String, String> params);

    String uploadFile(String path, SeaweedAssignJSON json);

    String uploadMultipartFile(MultipartFile file, SeaweedAssignJSON json);

    boolean deleteFile(String url);
}
