package com.bestbuy.storeTest;

import com.bestbuy.model.StoresPojo;
import com.bestbuy.testbase.TestBaseStore;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StorePostTest extends TestBaseStore {
    @Test

    public void addStore(){
        StoresPojo storespojo = new StoresPojo();
        storespojo.setName("Mani");
        storespojo.setType("BigStore");
        storespojo.setAddress("213 hoolooloo road");
        storespojo.setAddress2("next to mars");
        storespojo.setCity("Moon");
        storespojo.setState("Mahanagar");
        storespojo.setZip("aabbcc");
        storespojo.setLat(42.98);

        Response response = given()
                .header("Content-Type" , "application/json")
                .body(storespojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


    }



}
