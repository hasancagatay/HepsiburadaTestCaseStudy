package stepDefinitions;

import cucumber.api.java.en.And;
import pageModel.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @And("^Email adresi '(.*)' girilir\\.$")
    public void setEmail(String email) {
        loginPage.setEmail(email);
    }

    @And("^Email alanında Giriş Yap tıklanır\\.$")
    public void clickLoginWithEmail() {
        loginPage.clickLoginWithEmail();
    }

    @And("^Şifre '(.*)' girilir\\.$")
    public void setPassword(String password) {
        loginPage.setPassword(password);
    }

    @And("^Şifre alanında Giriş Yap tıklanır\\.$")
    public void clickLoginWithPassword() {
        loginPage.clickLoginWithPassword();
    }
}
