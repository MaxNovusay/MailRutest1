import javafx.scene.control.Button;
import org.apache.commons.codec.binary.StringUtils;
import org.hamcrest.MatcherAssert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;



public class MailRuTest {

    private static DriverHelper driverHelper;
    private static Pages pages;

    @BeforeClass
    public static void initialize() {
//        System.setProperty("webdriver.chrome.driver", "/home/camper/Downloads/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://mail.ru");
        driverHelper = new DriverHelper();
        pages = new Pages(driverHelper);

    }





    @Test
    public void userLogin() {


        pages.autorize("hdgs@mail.ru", "zaq1XSW@");
        pages.clickWriteButton();
        pages.fillAddressToSend("hdgs@mail.ru");
        pages.fillSubject("Тестовая тема для письма");
        pages.fillMsgField("Тестовое сообщение");
        pages.clickSendButton();
        pages.assertEquals();
        driverHelper.close();

    }
}
