package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(xpath="//span[@class='sf-OldMyAccount-PhY-T' and @title='Giriş Yap']")
    private WebElement lblLoginOrSignUp;

    @FindBy(id="login")
    private WebElement lblLogin;

    @FindBy(xpath="//a[@title='Hesabım']/span[1]")
    private WebElement lblMyAccount;

    @FindBy(css="input.desktopOldAutosuggestTheme-input")
    private WebElement txtSearchArea;

    @FindBy(xpath="//div[contains(text(),'ARA')]")
    private WebElement btnSearchArea;


    WebDriver driver;
    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void goToUrl(String url) {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clickLogin(){
        mouseOver(lblLoginOrSignUp);
        lblLogin.click();
    }

    public void checkLoginSuccessfully(String expectedResult){
        forceWait(2);
        assertion(lblMyAccount, expectedResult);
        System.out.println("Actual Result: " + lblMyAccount.getText() + " " + "Expected Result: " + expectedResult);
    }

    public void setSearchArea(String searchingItem) throws InterruptedException {
        forceWait(20);
        sendKeysFunction(txtSearchArea,searchingItem);
        btnSearchArea.click();
    }

    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
