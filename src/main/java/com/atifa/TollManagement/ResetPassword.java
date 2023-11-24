package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ReadJSONFile;

import static io.restassured.RestAssured.given;

public class ResetPassword {

    public Response reset(){
        GetAccessToken token= new GetAccessToken();
        String bearerToken="Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";

        String endPoint="/cognito-admin-set-user-password";

        String jsonFilePath="PasswordReset";
        String bodyOfPasswordReset= ReadJSONFile.readJSON(jsonFilePath);

        Response response=given()
                .header("Authorization",bearerToken)
                .header("Content-Type","application/json")
                .body(bodyOfPasswordReset)
                .when()
                .post(endPoint);

        System.out.println(response.prettyPrint());

        return response;

    }

    public static void main(String[] args) {
        ResetPassword pwd=new ResetPassword();
        pwd.reset();
    }
}
