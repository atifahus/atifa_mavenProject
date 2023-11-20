package com.atifa.WeatherApp;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetDailyForecast {
    /*
    * domain= api.openweathermap.org/data/2.5
    * resource= /forecast
    * Query1= lat=40.7029134
    * query2= lon= -73.8006429
    * query3= cnt=16
    * query4= appid=e536549daa1f8a9c4dec7d703a97262f
    * */

    public static void main(String[] args) {
        RestAssured.baseURI="https://api.openweathermap.org/data/2.5";

        String resource= "/forecast";
        String latitude= "40.7029134";
        String longitude ="-73.8006429";
        String cnt ="16";
        String apiKey= "e536549daa1f8a9c4dec7d703a97262f";

        Response response=given().queryParam("lat",latitude).queryParam("lon",longitude).queryParam("cnt",cnt).queryParam("appid",apiKey).get(resource);
        System.out.println(response.prettyPrint());
    }
}
