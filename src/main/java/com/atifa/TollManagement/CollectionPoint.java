package com.atifa.TollManagement;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CollectionPoint {
    /*
    * URI= https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev
    * endpoint=/toll-collection-list
    *Query= collectionPointId=NY088734
    * Header= Authorization= Bearer
    * */

    public Response collectPoint(){
        GetAccessToken token= new GetAccessToken();
        String bearerToken="Bearer "+token.getToken();

        RestAssured.baseURI="https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";

        String endPoint="/toll-collection-list";
        String queryPointId= "NY088734";

        Response response=given()
                .header("Authorization",bearerToken)
                .queryParam("collectionPointId",queryPointId)
                .when()
                .get(endPoint);

        System.out.println(response.prettyPrint());

        return response;
    }

    public static void main(String[] args) {
        CollectionPoint tollList= new CollectionPoint();
        tollList.collectPoint();
    }


}
