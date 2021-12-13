package stepDefinitions;

import io.cucumber.java.en.Given;
import model.GroceryApiModel;

public class GroceryApiTest {
    GroceryApiModel groceryApiModel =  new GroceryApiModel();

    @Given("^Name '(.*)', Price '(.*)' ve Stock '(.*)' olan ürünün yer aldığı kontrol edilir.$")
    public void checkOneOfTheProduct(String name, int price, int stock) {
        groceryApiModel.checkOneOfTheProduct(name, price, stock);
    }

    @Given("^id '(.*)', name '(.*)', price '(.*)', stock '(.*)' ürünü eklenir.$")
    public void idNamePriceÜrünüEklenir(int id, String name, Double price, int stock) {
        groceryApiModel.postGroceryProduct(id, name, price, stock);
    }

    @Given("Ürünlerin bulunduğu kontrol edilir.")
    public void checkAllGroceryControl() {
        groceryApiModel.checkAllGroceryControl();
    }

    @Given("Not found hatası alınıp alınmadığı kontrol edilir.")
    public void CheckNotFound() {
        groceryApiModel.CheckNotFound();
    }
}
