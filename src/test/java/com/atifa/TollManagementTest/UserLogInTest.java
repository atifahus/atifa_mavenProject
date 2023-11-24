package com.atifa.TollManagementTest;

import com.atifa.TollManagement.UserLogIn;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLogInTest {
    @Test
    public void logInTest(){
        UserLogIn login= new UserLogIn();
        Response rs=login.logIn();

        Assert.assertEquals(rs.jsonPath().get("statusCode"), Integer.valueOf(200));
        Assert.assertEquals(rs.jsonPath().get("IsSuccess"),"YES");
        Assert.assertEquals(rs.jsonPath().get("message"),"Log in successfully!");
    }
}
