package stepDefinitions;

import cucumber.api.java.en.And;
import pageModel.SearchPage;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    @And("^Ürün listesinden (.*). ürün seçilir$")
    public void clickProduct(int index) {
        searchPage.clickProduct(index);
    }
}
