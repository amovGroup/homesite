package com.amov.homesite.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;

import java.util.List;

public class JsonResult {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private Integer statusCode;

    private String msg;

    private Object body;

    public static JsonResult build(HttpStatus status, String msg, Object data) {
        return new JsonResult(status, msg, data);
    }

    public static JsonResult build(HttpStatus status, String msg) {
        return new JsonResult(status, msg, null);
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(data);
    }

    public static JsonResult ok() {
        return new JsonResult(null);
    }

    public static JsonResult created() {
        return new JsonResult(HttpStatus.CREATED, "create success", null);
    }

    public static JsonResult error(String error) {
        return new JsonResult(HttpStatus.INTERNAL_SERVER_ERROR, error, null);
    }


    public JsonResult(HttpStatus status, String msg, Object body) {
        this.statusCode = status.value();
        this.msg = msg;
        this.body = body;
    }

    public JsonResult(Object body) {
        this.statusCode = HttpStatus.OK.value();
        this.msg = "OK";
        this.body = body;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public static JsonResult format(String json) {
        try {
            return MAPPER.readValue(json, JsonResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}

