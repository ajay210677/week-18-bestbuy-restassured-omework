package com.bestbuy.storeTest;

import com.bestbuy.model.StoresPojo;
import com.bestbuy.testbase.TestBaseStore;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StrorePutTest extends TestBaseStore {
    @Test

    public void putStoreDetails(){

        StoresPojo storepjo = new StoresPojo();
        storepjo.setName("Minne");
        storepjo.setType("Big");
        storepjo.setAddress("13513 Ridgedale Dr");
        storepjo.setAddress2("Mall");
        storepjo.setCity("Hopkins");
        storepjo.setState("MN");
        storepjo.setZip("5530");
        storepjo.setLat(44.25);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 4)
                .body(storepjo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
