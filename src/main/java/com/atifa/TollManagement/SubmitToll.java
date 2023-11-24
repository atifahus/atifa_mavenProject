package com.atifa.TollManagement;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ReadJSONFile;

import static io.restassured.RestAssured.given;

public class SubmitToll {
    /*
    * URI= https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev/tollcollection
    * Bearer auth
    * Header=Authorization
    *       =Content-Type=text/plain
    * Body= resources
    *
    * */

    public Response submitToll(){
        GetAccessToken token=new GetAccessToken();
        String bearerToken= "Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";
        String endpoint="/tollcollection";

        String jsonFilePath = "SubmitToll";
        String bodyOfSubmitToll = ReadJSONFile.readJSON(jsonFilePath);
        Response response=given()
                .header("Authorization",bearerToken)
                .header("Content-Type","text/plain")
                .body(bodyOfSubmitToll)
                .when()
                .post(endpoint);

        System.out.println(response.prettyPrint());

        return response;
    }
    public static void main(String[] args) {

        SubmitToll submit= new SubmitToll();
        submit.submitToll();

    }


}
