import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverHelper {

    WebDriver driver;

    public DriverHelper() {

        System.setProperty("webdriver.chrome.driver", "/home/camper/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru");
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }
}
