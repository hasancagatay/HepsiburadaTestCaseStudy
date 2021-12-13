package model;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.testng.Assert;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class GroceryApiModel {

    public String baseURI = "http://localhost:3000/";
    public String getEndPoint = "allGrocery";
    public String wrongEndPoint = "/strawberry";
    JSONObject request = new JSONObject();

    public void checkOneOfTheProduct(String name, int price, int stock){
        given().contentType(ContentType.JSON)
                .queryParam("name",name)
                .when()
                .get(baseURI + getEndPoint)
                .then()
                .statusCode(200)


                .body("price[0]", equalTo(price))
                .body("stock[0]", equalTo(stock));
    }

    public void checkAllGroceryControl(){
        Response response = given()
                .get(baseURI + getEndPoint)
                .then()
                .statusCode(200)
                .extract().response();

        Assert.assertNotNull(response.getBody().jsonPath().getList("id").get(0));
    }

    public void CheckNotFound(){
        given().contentType(ContentType.JSON)
                .when()
                .get(baseURI + getEndPoint + wrongEndPoint)
                .then()
                .statusCode(404);
    }

    public void postGroceryProduct(int id, String name, Double price, int stock){
        request.put("id",id);
        request.put("name", name);
        request.put("price",price);
        request.put("stock", stock);


        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Content-Type", "application/json")
                .and()
                .body(request.toJSONString())
                .when()
                .post(baseURI + getEndPoint)
                .then()
                .statusCode(201)
                .log().all();
    }

}
