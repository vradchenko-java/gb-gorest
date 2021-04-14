package com.gb.test;

import com.gb.gorest.model.request.UserCreate;
import com.gb.gorest.model.response.UserResponse;
import com.gb.gorest.steps.UserSteps;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class UserControllerTest {
    private UserSteps userSteps = new UserSteps();

    @Test
    public void createUserTest() {
        UserCreate user = UserCreate.builder()
                .email(String.format("%s@test.com", randomAlphabetic(15)))
                .name(randomAlphabetic(10))
                .gender("Male")
                .status("Active")
                .build();

        UserResponse createdUser = userSteps.createUser(user);
        Assertions.assertThat(createdUser.getCode())
                .as("User was not create")
                .isEqualTo(201);
    }
}
