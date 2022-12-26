package com.bestbuy.productTest;

import com.bestbuy.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductsDeleteTest extends TestBaseProducts {

    @Test

    public void deleteSingleStudentsInfo() {
        Response response =  given()
                .pathParam("id",43900)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }

}
