package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserList {

    public Response userList(){
        GetAccessToken token=new GetAccessToken();
        String bearerToken="Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";
        String endPoint="/cognito-user-list";

        Response response=given()
                .header("Authorization",bearerToken)
                .when()
                .get(endPoint);

        System.out.println(response.prettyPrint());

        return response;
    }

    public static void main(String[] args) {
        UserList list=new UserList();
        list.userList();
    }
}
