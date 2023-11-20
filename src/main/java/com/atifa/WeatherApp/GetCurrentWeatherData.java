package com.atifa.WeatherApp;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class GetCurrentWeatherData {
    /*
    * domain= https://api.openweathermap.org/data/2.5
    * resource= /weather
    * queryParameter1 = ?lat=40.7029134
    * queryPar2= &lon= -73.8006429
    * queryPar3= &appid= e536549daa1f8a9c4dec7d703a97262f
    *
    * */

    public static void main(String[] args) {
        RestAssured.baseURI="https://api.openweathermap.org/data/2.5";

        String resource= "/weather";
        String apiId="e536549daa1f8a9c4dec7d703a97262f";
        String latitude="40.7029134";
        String longitude="-73.8006429";
        String unit= "metric";

       Response response=given().queryParam("lat",latitude).queryParam("lon",longitude).queryParam("appid",apiId).queryParam("unit",unit).get(resource);
        System.out.println(response.prettyPrint());
    }

}
