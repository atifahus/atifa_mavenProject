package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static io.restassured.RestAssured.given;

public class GetAccessToken {

    /*https://is-toll-plaza-user-pool.auth.us-east-1.amazoncognito.com/oauth2/token?scope=feature-toll-plaza/read&grant_type=client_credentials
     * domain= https://is-toll-plaza-user-pool.auth.us-east-1.amazoncognito.com
     * Basic Auth= t5bi323d5o1sp39q2jp9okjor : 7s6jcc3l0gmaps2ce9gt6cd6nm4sif8l77e0cae3lbnb5rp0mpa
     * x-www-form-urlencoded
     * body1 = scope=feature-toll-plaza/read
     * body2 = grant_type=client_credentials
     * endPoint= /oauth2/token
     *
     * */

    public String getToken(){
        RestAssured.baseURI="https://is-toll-plaza-user-pool.auth.us-east-1.amazoncognito.com";

        String endPoint= "/oauth2/token";

        String userName= "t5bi323d5o1sp39q2jp9okjor";
        String password= "7s6jcc3l0gmaps2ce9gt6cd6nm4sif8l77e0cae3lbnb5rp0mpa";

        String credential=userName+":"+password;

        byte[] credentialInByte=credential.getBytes(StandardCharsets.UTF_8);

        String encodedAuthCredential=Base64.getEncoder().encodeToString(credentialInByte);

        String basicCredential="Basic "+encodedAuthCredential;


        String bodyOfToken="scope=feature-toll-plaza/read&grant_type=client_credentials";
        Response response=given()
                .header("Content-Type","application/x-www-form-urlencoded")
                .header("Authorization",basicCredential)
                .body(bodyOfToken)
                .post(endPoint);

        System.out.println(response.prettyPrint());

       String authToken= response.jsonPath().get("access_token");

       return authToken;

    }
    public static void main(String[] args) {

            GetAccessToken tokenAccess=new GetAccessToken();
            tokenAccess.getToken();




    }
}
