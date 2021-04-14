package com.gb.gorest.steps;

import com.gb.gorest.controller.UserController;
import com.gb.gorest.model.request.UserCreate;
import com.gb.gorest.model.response.UserResponse;

import java.util.Arrays;
import java.util.List;

public class UserSteps {
    private UserController userController = new UserController();

    public UserResponse createUser(UserCreate user) {
        return userController.createUser(user)
                .statusCode(200)
                .extract().body()
                .as(UserResponse.class);
    }

    public List<UserResponse> getUsers() {
        return Arrays.asList(userController.getUser()
                .statusCode(200)
                .extract().body()
                .as(UserResponse[].class));
    }
}
