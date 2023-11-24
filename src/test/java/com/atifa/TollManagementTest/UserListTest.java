package com.atifa.TollManagementTest;

import com.atifa.TollManagement.UserList;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserListTest {
    @Test
    public void userListTest(){
        UserList list=new UserList();
        Response ul=list.userList();

        Assert.assertEquals(ul.jsonPath().get("statusCode"),Integer.valueOf(200));
        Assert.assertEquals(ul.jsonPath().get("IsSuccess"),"YES");
        Assert.assertEquals(ul.jsonPath().get("message"),"User List!");


    }
}
