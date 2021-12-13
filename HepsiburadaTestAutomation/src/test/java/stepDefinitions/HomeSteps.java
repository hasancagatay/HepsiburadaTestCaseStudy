package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageModel.HomePage;


public class HomeSteps {
    private WebDriver driver;
    HomePage homePage = new HomePage();

    @Given("^'(.*)' sayfasına gidilir\\.$")
    public void goToUrl(String url) {
        homePage.goToUrl(url);
    }

    @When("^Giriş Yap ya da üye ol kısmında Giriş Yap tıklanır\\.$")
    public void clickLogin() {
        homePage.clickLogin();
    }

    @Then("^'(.*)' yazısı görülerek başarılı giriş yapıldığı doğrulanır\\.$")
    public void checkLoginSuccessfully(String expectedResult) {
        homePage.checkLoginSuccessfully(expectedResult);
    }

    @When("^Arama kutucuğuna '(.*)' yazılarak ürün aratılır\\.$")
    public void setSearchArea(String searchingItem) throws InterruptedException {
        homePage.setSearchArea(searchingItem);
    }

    @After
    public void quitDriver() throws InterruptedException {
        homePage.quitDriver();
    }

}
