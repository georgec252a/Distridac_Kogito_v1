package com.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;

public class A6_BDD_DELETE {

    RequestSpecification requestSpecification;

    ResponseSpecification responseSpecification;
    String payload;

    @BeforeClass
    public void beforeClass() {
        //I. Version without Builder
        //**********************************************************************
        //Using NonBDD RequestSpecification
        //        requestSpecification=given().baseUri("http://localhost:8086/").
        //                header("Content-Type", "json").
        //                log().all();
        //        RestAssured.requestSpecification=requestSpecification;

        //Using NonBDD ResponseSpecification
        //        responseSpecification= RestAssured.expect().
        //                statusCode(200).
        //                contentType(ContentType.JSON).
        //                log().all();
        //        RestAssured.responseSpecification=responseSpecification;
        //**********************************************************************

        //II. Version with Builder
        //**********************************************************************
        //Using the builder - RequestSpecBuilder

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("http://localhost:8086/");
        requestSpecBuilder.addHeader("Content-Type", "json");
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.log(LogDetail.ALL);
        RestAssured.requestSpecification = requestSpecBuilder.build();

        //Using the builder - ResponseSpecBuilder
        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectStatusCode(201);
        responseSpecBuilder.expectContentType(ContentType.JSON);
        RestAssured.responseSpecification = responseSpecBuilder.build();

        //**********************************************************************

    }

    //-------------TEST1-------------------
    //--------------------------------------
    //Verificare status code 201 pentru PUT pe endpoint-ul intrare_auto_cle
    @org.testng.annotations.Test
    public void PUT1_intrare_auto_cle() {
        String id = "1";

        given().
                pathParam("intrareId", id).
        when().
                delete("/intrare_auto_cle/{intrareId}").
        then().
                log().
                all().
                assertThat().
                body("intrareCLE.marcaSofer", equalToObject("12345678")).
                body("intrareCLE.vin", equalToObject("12345678901234567")).
                body("intrareCLE.id", equalToObject("1"));
    }
    
}