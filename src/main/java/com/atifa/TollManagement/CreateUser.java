package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateUser {
    public Response createUser() {
        /*
        *URI=https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev/cognito-create-user
        * Auth= Bearer Token
        * Header= Content-Type=application/json
        *         Authorization= Bearer
        * Body = raw
        * */

        GetAccessToken token=new GetAccessToken();
        String bearerToken="Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";

        String endPoint="/cognito-create-user";

        String bodyToCreateUser = "{\"username\":\"Atihuss\",\"password\":\"Asqf@1234\",\"email\":\"atihhhqw@gmail.com\",\"userType\":\"User\",\"name\":\"Test Data\"}";

        Response response= given()
                .header("Content-Type","application/json")
                .header("Authorization",bearerToken)
                .body(bodyToCreateUser)
                .when()
                .post(endPoint);

        System.out.println(response.prettyPrint());



    return response;



    }

    public static void main(String[] args) {
        CreateUser newUser =new CreateUser();
        newUser.createUser();
    }


}

