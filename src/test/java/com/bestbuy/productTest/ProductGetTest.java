package com.bestbuy.productTest;

import com.bestbuy.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductGetTest extends TestBaseProducts {
    @Test
    public void getAllStudentsInfo() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();


    }@Test
    public void getSingleStudentInfo(){
        Response response = given()
                .pathParam("id",43900)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();





}}
