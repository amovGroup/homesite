package com.amov.homesite.dto;

public class SeaweedAssignJSON {
    private String fid;
    private String url;
    private String publicUrl;
    private Integer count;

    public String getFid() {
        return fid;
    }

    @Override
    public String toString() {
        return "SeaweedAssignJSON{" +
                "fid='" + fid + '\'' +
                ", url='" + url + '\'' +
                ", publicUrl='" + publicUrl + '\'' +
                ", count=" + count +
                '}';
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
