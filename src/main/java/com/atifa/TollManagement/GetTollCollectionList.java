package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetTollCollectionList {
    /*
    * url= https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev/toll-collection-list
    *
    * Header1=Authorization= Bearer
    *
    * */
    public Response tollCollectionList() {
        GetAccessToken token=new GetAccessToken();
        String bearerToken="Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";
        String endPoint="/toll-collection-list";

        Response response=given()
                .header("Authorization",bearerToken)
                .when()
                .get(endPoint);

        System.out.println(response.prettyPrint());

        return response;

    }

    public static void main(String[] args) {
        GetTollCollectionList list=new GetTollCollectionList();
        list.tollCollectionList();
    }
}
