package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageModel.ProductPage;

public class ProductSteps {
    ProductPage productPage = new ProductPage();

    @And("^Tüm Satıcılar tab'ı tıklanır\\.$")
    public void clickAllSellersTab() throws InterruptedException {
        productPage.clickAllSellersTab();
    }

    @Then("^Pencere geçişi yapılır\\.$")
    public void changeWindowTab() {
        productPage.changeWindowTab();
    }

    @And("^Ürün sayfası kontrol edilir\\.$")
    public void checkProductPage() {
        productPage.checkProductPage();
    }

    @And("^Ürün ilk satıcıdan sepete eklenir\\.$")
    public void clickAddFirstProductToBasket() throws InterruptedException {
        productPage.clickAddFirstProductToBasket();
    }

    @And("^Onarım Paketi popup'ında Onarım pakati istemiyorum tıklanır\\.$")
    public void clickClosePopUpRepairPack() throws InterruptedException {
        productPage.clickClosePopUpRepairPack();
    }

    @And("^İkinci popup kapatılır\\.$")
    public void clickCloseSecondPopUp() throws InterruptedException{
        productPage.clickCloseSecondPopUp();
    }

    @And("^Ürün ikinci satıcıdan sepete eklenir\\.$")
    public void clickAddSecondProductToBasket() throws InterruptedException {
        productPage.clickAddSecondProductToBasket();
    }

    @And("^Sepetim tıklanır\\.$")
    public void clickCartButton() throws InterruptedException {
        productPage.clickCartButton();
    }
}


