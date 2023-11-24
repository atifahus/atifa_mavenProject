package com.atifa.TollManagementTest;

import com.atifa.TollManagement.CreateUser;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest {
    @Test
    public void createUserTest(){
        CreateUser user=new CreateUser();
        Response cu=user.createUser();

        Assert.assertEquals(cu.jsonPath().get("statusCode"),Integer.valueOf(200));
        Assert.assertEquals(cu.jsonPath().get("IsSuccess"),"YES");
    }
}
