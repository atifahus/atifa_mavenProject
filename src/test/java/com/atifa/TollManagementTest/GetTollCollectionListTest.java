package com.atifa.TollManagementTest;

import com.atifa.TollManagement.GetTollCollectionList;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTollCollectionListTest {
    @Test
    public void tollList() {
        GetTollCollectionList collectionTest=new GetTollCollectionList();
        Response cl= collectionTest.tollCollectionList();


        Assert.assertEquals(cl.jsonPath().get("statusCode"),Integer.valueOf(200));
        Assert.assertEquals(cl.jsonPath().get("message"),"success");




    }

}
