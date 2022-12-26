package com.bestbuy.categoriesTest;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends TestBaseCategories {

    @Test
    public void createCategory(){
       // List<String> categoryList = new ArrayList<>();
      //  categoryList.add("abc00001111");
      //  categoryList.add("Super Gift");

        CategoriesPojo categoryPojo = new CategoriesPojo();
        categoryPojo.setName("Super Gift");
        categoryPojo.setId("abcat001000011");


        Response response = given()
                .header("Content-Type" , "application/json")
                .body(categoryPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }



}
