package com.bestbuy.storeTest;

import com.bestbuy.testbase.TestBaseStore;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoreGetTest extends TestBaseStore {

    @Test
    public void getListOfAllStore(){
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
