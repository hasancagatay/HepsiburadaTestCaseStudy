package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//li[contains(@class,'basket_item_1rDra')]")
    private List<WebElement> lstBasketItems;

    WebDriver driver;
    public BasketPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void checkBasketItems() {
        Assert.assertTrue(lstBasketItems.size() > 0, "Sepette ürün bulunmamaktadır.");
    }

}
