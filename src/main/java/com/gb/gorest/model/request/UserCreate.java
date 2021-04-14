package com.gb.gorest.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCreate {
    private String name;
    private String gender;
    private String email;
    private String status;
}
