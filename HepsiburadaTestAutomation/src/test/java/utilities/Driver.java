package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Properties;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            Properties properties = System.getProperties();
            System.setProperty("webdriver.chrome.driver", properties.getProperty("user.dir") + "//drivers//chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
