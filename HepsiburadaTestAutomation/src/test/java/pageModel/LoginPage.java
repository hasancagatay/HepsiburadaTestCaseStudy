package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends BasePage{

    @FindBy(xpath="//input[@name='username']")
    private WebElement txtEmail;

    @FindBy(xpath="//input[@name='password']")
    private WebElement txtPassword;

    @FindBy(id="btnLogin")
    private WebElement btnLoginWithEmail;

    @FindBy(id="btnEmailSelect")
    private WebElement btnLoginWithPassword;



    WebDriver driver;
    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email){
        sendKeysFunction(txtEmail,email);
    }

    public void setPassword(String password){
        sendKeysFunction(txtPassword,password);
    }

    public void clickLoginWithEmail(){
        btnLoginWithEmail.click();
    }

    public void clickLoginWithPassword(){
        btnLoginWithPassword.click();
    }


}
