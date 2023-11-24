package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils {


    private static Response response;


    public static Response getResponse() {
        return response;
    }


    public static void setBaseURI(String uri) {
        RestAssured.baseURI = uri;
    }

    public static String getBaseUri() {
        return RestAssured.baseURI;
    }

    public static Response get(Map<String, String> header, String endPoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .headers(header)
                .when()
                .get(endPoint)
                .then()
                .log().all()
                .extract().response();
    }

    public static Response post(Object json, ContentType contentType, String endPoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .body(json)
                .when()
                .post(endPoint)
                .then()
                .log().all()
                .extract().response();


    }

    public static Response post(Map<String, String> header, Object json, ContentType contentType, String endPoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .headers(header)
                .body(json)
                .when()
                .post(endPoint)
                .then()
                .log().all()
                .extract().response();


    }
}
