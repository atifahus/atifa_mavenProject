package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ReadJSONFile;

import static io.restassured.RestAssured.given;

public class UserLogIn {
    public Response logIn(){
        GetAccessToken token= new GetAccessToken();
        String bearerToken="Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";

        String endPoint="/cognito-login";

        String jsonFilePath="LogInCredential";
        String bodyOfLogIn= ReadJSONFile.readJSON(jsonFilePath);

        Response response=given()
                .header("Authorization",bearerToken)
                .header("Content-Type","application/json")
                .body(bodyOfLogIn)
                .when()
                .post(endPoint);

        System.out.println(response.prettyPrint());

        return response;

    }

    public static void main(String[] args) {
        UserLogIn login= new UserLogIn();
        login.logIn();
    }

}
