package com.gb.gorest.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse {
    private int code;
    private String meta;
    public UserInfo data;

    @lombok.Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class UserInfo {
        private int id;
        private String name;
        private String email;
        private String gender;
        private String status;
        private String created_at;
        private String updated_at;
    }
}
