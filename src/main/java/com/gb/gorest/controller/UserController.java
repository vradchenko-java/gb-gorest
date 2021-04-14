package com.gb.gorest.controller;

import com.gb.gorest.model.request.UserCreate;
import com.gb.gorest.utils.RequestSpecificationFactory;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class UserController {

    public ValidatableResponse createUser(UserCreate user) {
        return RestAssured.given()
                .spec(RequestSpecificationFactory.withToken())
                .body(user)
                .post("/public-api/users")
                .then();
    }

    public ValidatableResponse getUser() {
        return RestAssured.given()
                .spec(RequestSpecificationFactory.withoutToken())
                .get("/public-api/users")
                .then();
    }

}
