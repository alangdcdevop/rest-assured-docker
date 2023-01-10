package com.restassured.app;

import io.restassured.builder.*;
import io.restassured.http.*;
import io.restassured.specification.*;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

import com.restassured.app.Request.*;

public class ApiTest {

    // Cada test es un scenario
    @Test
    public void pruebaApi() {
        // Precondiciones del REQUEST

        given().log().all().
        // Accion a donde va a ir el REQUEST
                when().get("https://petstore.swagger.io/v2/pet/12").
                // Validaciones que debemos tener en cuenta del RESPONSE
                then().log().all().assertThat().statusCode(200);

        // Main bodyClass = new Main("sape", "sapepe");

        // JSONObject category = new JSONObject()
        // .put("id", 0)
        // .put("name", "string");

        // JSONObject photoUrls = new JSONObject()
        // .put("string", "string");

        // JSONObject tags = new JSONObject()
        // .put("id", 0)
        // .put("name", "string");

        // JSONObject body = new JSONObject()
        // .put("id", 0)
        // .put("status", "available")
        // .put("name", "doggie")
        // .put("category", category)
        // .put("photoUrls", photoUrls)
        // .put("tags", category);

        // given().log().all()
        // .header("Content-type", "application/json")
        // // .contentType("application/json")
        // .and()
        // .body(body.toString())
        // // .body(bodyClass)
        // .when()
        // .post("https://petstore.swagger.io/v2/pet")
        // .then().log().all().assertThat().statusCode(200);
        // .extract().response();

    }

}
