package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//li[@class='productListContent-item']")
    private List<WebElement> listedProducts;

    WebDriver driver;
    public SearchPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickProduct(int index){
        WebElement specificProduct = waitUntilAllElementsVisible(listedProducts).get(index - 1);
        waitUntilClickable(specificProduct).click();
        forceWait(3);
    }
}
