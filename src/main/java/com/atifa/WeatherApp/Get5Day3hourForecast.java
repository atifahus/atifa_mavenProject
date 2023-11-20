package com.atifa.WeatherApp;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class Get5Day3hourForecast {
    public static void main(String[] args) {
        /*
        * domain= api.openweathermap.org/data/2.5
        * resource= /forecast
        * lat=40.7029134
        * lon=-73.8006429
        * appid=e536549daa1f8a9c4dec7d703a97262f
        * */

        RestAssured.baseURI="https://api.openweathermap.org/data/2.5";

        String resource= "/forecast";
        String latitude= "41.8460595";
        String longitude ="-94.3081492";
        String apiKey= "e536549daa1f8a9c4dec7d703a97262f";
        String unit= "metric";

        Response response=given().queryParam("lat",latitude).queryParam("lon",longitude).queryParam("appid",apiKey).queryParam("unit",unit).get(resource);
        System.out.println(response.prettyPrint());
    }
}
