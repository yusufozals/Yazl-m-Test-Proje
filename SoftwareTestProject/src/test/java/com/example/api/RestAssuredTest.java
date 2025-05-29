package com.example.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://httpbin.org";
    }

    @Test
    public void testGetRequest() {
        given()
                .log().all()
                .when()
                .get("/get")
                .then()
                .log().all()
                .statusCode(200)
                .body("url", equalTo("https://httpbin.org/get"))
                .body("headers", notNullValue())
                .body("origin", notNullValue());

        System.out.println("GET /get testi başarılı!");
    }

    @Test
    public void testPostRequest() {
        String requestBody = "{"
                + "\"name\": \"John Doe\","
                + "\"age\": 30,"
                + "\"city\": \"Istanbul\""
                + "}";

        given()
                .header("Content-type", "application/json; charset=UTF-8")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .log().all()
                .statusCode(200)
                .body("json.name", equalTo("John Doe"))
                .body("json.age", equalTo(30))
                .body("json.city", equalTo("Istanbul"))
                .body("url", equalTo("https://httpbin.org/post"));

        System.out.println("POST /post testi başarılı!");
    }
}