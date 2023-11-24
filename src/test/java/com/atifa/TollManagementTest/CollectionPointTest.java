package com.atifa.TollManagementTest;

import com.atifa.TollManagement.CollectionPoint;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionPointTest {
    @Test
    public void tollList(){
        CollectionPoint list=new CollectionPoint();
        Response rs=list.collectPoint();

        Assert.assertEquals(rs.jsonPath().get("statusCode"),Integer.valueOf(200));
        Assert.assertEquals(rs.jsonPath().get("IsSuccess"),"YES");
        Assert.assertEquals(rs.jsonPath().get("message"),"success");


    }
}
