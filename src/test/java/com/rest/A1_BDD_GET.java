package com.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BDD_GET {

    RequestSpecification requestSpecification;

    ResponseSpecification responseSpecification;

    //-------------TEST1-------------------
    //--------------------------------------
    //Verificare status code 200 pentru GET pe endpoint-ul intrare_auto_cle
    @org.testng.annotations.Test
    public void testGet_intrare_auto_cle() {

        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200);
    }

    //-------------TEST2-------------------
    //--------------------------------------
    //Extrage din raspuns anumite valori
    @org.testng.annotations.Test
    public void extractSingleResponse_intrare_auto_cle() {
        Response res =
                given().
                    baseUri("http://localhost:8086/").
                when().
                        get("/intrare_auto_cle").
                then().
                        log().
                        all().
                        assertThat().
                        statusCode(200).
                        extract().
                        response();

        JsonPath jsonPath = new JsonPath(res.asString());
        System.out.println("response = " + res.path("[0].id"));
        System.out.println("response = " + jsonPath.getString("[1].id"));
        System.out.println("response = " + jsonPath.getString("[1].id"));
        System.out.println();
    }

    //-------------TEST3-------------------
    //--------------------------------------
    //Extrage din raspuns valoarea ID-ului si verifica daca corespunde cu o anumita valoare
    @org.testng.annotations.Test
    public void extractResponseAndAssert_intrare_auto_cle() {
        String res =
        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200).
                extract().
                response().
                path("[0].id");

        assertThat(res, equalTo("e5bca575-5ebc-4f36-a31a-5f77a7e4dadb"));
        Assert.assertEquals(res, "e5bca575-5ebc-4f36-a31a-5f77a7e4dadb");
    }

    //-------------TEST4-------------------
    //--------------------------------------
    //test Hamcrest contains() - verifica daca id-ul din raspuns contine o anumita valoare
    @org.testng.annotations.Test
    public void ContainsID_intrare_auto_cle() {
        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200).
                body("id", contains("e5bca575-5ebc-4f36-a31a-5f77a7e4dadb", "2fe7d5b3-e0a9-48f3-a435-57ca8174b25e"));
    }

    //-------------TEST5-------------------
    //--------------------------------------
    //test Hamcrest empty() - verifica daca in raspuns id-ul este vid
    @org.testng.annotations.Test
    public void Empty_intrare_auto_cle() {
        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200).
                body("id", empty());
    }

    //-------------TEST6-------------------
    //--------------------------------------
    //test Hamcrest not(emptyArray()) - verifica daca vreun ID este null
    @org.testng.annotations.Test
    public void NotEmpty_intrare_auto_cle() {
        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200).
                body("id", not(emptyArray()));

    }

    //-------------TEST7-------------------
    //--------------------------------------
    //test Hamcrest hasSize()) - verifica daca dimensiunea ID-ului are dimensiunea 2
    @org.testng.annotations.Test
    public void Size_intrare_auto_cle() {
        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200).
                body("id", hasSize(2));

    }

    //-------------TEST8-------------------
    //--------------------------------------
    //test Hamcrest hasValue()) - verifica daca exista o anumita valoarea in locatia[0]
    @org.testng.annotations.Test
    public void HasValue_intrare_auto_cle() {
        given().
                baseUri("http://localhost:8086/").
        when().
                get("/intrare_auto_cle").
        then().
                log().
                all().
                assertThat().
                statusCode(200).
                body("[0]", hasValue("e5bca575-5ebc-4f36-a31a-5f77a7e4dadb"));
    }


}
