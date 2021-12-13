package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(xpath="//td[@id='merchantTabTrigger']/a")
    private WebElement btnAllSellers;

    @FindBy(xpath="//a[contains(@class,'optionsLength') and contains(text(),'Tümü')]")
    private WebElement btnOptionsLength;

    @FindBy(id = "addToCart")
    private WebElement addToCartButton;

    @FindBy(className = "add-Cart")
    private List<WebElement> addToCartButtonInTheAllSellersTab;

    @FindBy(className = "deny-text")
    private WebElement popUpRepairPack;

    @FindBy(xpath = "//h1//a[contains(@class,'checkoutui-Modal-')]")
    private WebElement btnSecondPopup;

    @FindBy(xpath = "//span[contains(text(), 'Sepetim')]")
    private WebElement btnMyCart;

    WebDriver driver;
    public ProductPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickAllSellersTab() throws InterruptedException {
        scrollToElement(btnOptionsLength);
        clickFunction(btnOptionsLength);
    }

    public void changeWindowTab() {
        String currentWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            System.out.println(currentWindow);
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }

    public void checkProductPage() {
        waitUntilVisible(addToCartButton);
    }

    public void clickAddFirstProductToBasket() throws InterruptedException {
        WebElement firstProduct = addToCartButtonInTheAllSellersTab.get(0);
        scrollToElement(firstProduct);
        clickFunction(firstProduct);
    }

    public void clickClosePopUpRepairPack() throws InterruptedException {
        Thread.sleep(1000);
        if (popUpRepairPack.isDisplayed()) {
            waitUntilVisibleAndThenClick(popUpRepairPack);
        }
    }

    public void clickCloseSecondPopUp() throws InterruptedException {
        waitUntilVisibleAndThenClick(btnSecondPopup);
    }

    public void clickAddSecondProductToBasket() throws InterruptedException {
        WebElement secondProduct = addToCartButtonInTheAllSellersTab.get(1);
        scrollToElement(secondProduct);
        clickFunction(secondProduct);
    }

    public void clickCartButton() throws InterruptedException {
        scrollToElement(btnMyCart);
        clickFunction(btnMyCart);
    }

}
