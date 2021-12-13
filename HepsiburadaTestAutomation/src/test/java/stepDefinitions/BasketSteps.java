package stepDefinitions;

import cucumber.api.java.en.Then;
import pageModel.BasketPage;


public class BasketSteps {
    BasketPage basketPage = new BasketPage();

    @Then("^Farklı satıcılardan sepete eklenen iki ürün Sepetim alanında görülür\\.$")
    public void checkBasketItems() {
        basketPage.checkBasketItems();
    }
}
