package com.gb.gorest.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationFactory {

    public static RequestSpecification withoutToken() {
        return new RequestSpecBuilder()
                .setBaseUri(PropertyLoader.getUri())
                .addHeader("Content-type", "application/json")
                .addHeader("Accept", "application/json")
                .log(LogDetail.ALL)
                .build();
    }

    public static RequestSpecification withToken() {
        return new RequestSpecBuilder()
                .setBaseUri(PropertyLoader.getUri())
                .addHeader("Accept", "application/json")
                .addHeader("Content-type", "application/json")
                .addHeader("Authorization",  "Bearer " + PropertyLoader.getApiToken())
                .log(LogDetail.ALL)
                .build();
    }
}
