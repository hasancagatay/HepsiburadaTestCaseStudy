package pageModel;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

public abstract class BasePage {
    private static Driver driver;
    private WebDriver webdriver = driver.getDriver();
    WebDriverWait wait = new WebDriverWait(webdriver,30);

    public void clickFunction(WebElement clickWebElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickWebElement));
        clickWebElement.click();
    }

    public void mouseOver(WebElement mouseOverElement){
        Actions action = new Actions(webdriver);
        action.moveToElement(mouseOverElement).build().perform();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void assertion(WebElement actual,String expectedResult){
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getText(),expectedResult);
        System.out.println("Page message:" + actual.getText());
    }

    public void forceWait(int timeOut){
        try {
            Thread.sleep((timeOut*1000));
        }
        catch (InterruptedException exception) {}
    }

    public WebElement waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitUntilVisibleAndThenClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        return element;
    }

    public WebElement waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public List<WebElement> waitUntilAllElementsVisible(List<WebElement> listedProducts) {
        wait.until(ExpectedConditions.visibilityOfAllElements(listedProducts));
        return listedProducts;
    }

    public static void switchToWindow(WebDriver driver){
        for (String windowsHandle: driver.getWindowHandles()){
            driver.switchTo().window(windowsHandle);
        }
    }

    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    public void scrollToElement(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) webdriver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }


}
