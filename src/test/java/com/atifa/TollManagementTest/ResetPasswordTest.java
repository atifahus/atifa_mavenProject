package com.atifa.TollManagementTest;

import com.atifa.TollManagement.ResetPassword;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetPasswordTest {
    @Test
    public void resetTest(){
        ResetPassword pass=new ResetPassword();
        Response rs=pass.reset();

        Assert.assertEquals(rs.jsonPath().get("statusCode"),Integer.valueOf(200));
        Assert.assertEquals(rs.jsonPath().get("IsSuccess"),"YES");
        Assert.assertEquals(rs.jsonPath().get("message"),"Password set successfully!");

    }
}
