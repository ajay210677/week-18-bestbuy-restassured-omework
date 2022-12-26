package com.bestbuy.categoriesTest;

import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesGetTest extends TestBaseCategories {
    @Test
    public void getAllCategories() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleCategory() {
        Response response = given()
                .pathParam("id","abcat0010000")
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
}






}
