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


    private static Pages pages;
    private static Elements elements;

    @BeforeClass
    public static void initialize() {
//        System.setProperty("webdriver.chrome.driver", "/home/camper/Downloads/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://mail.ru");
        DriverHelper driverHelper = new DriverHelper();
        pages = new Pages(driverHelper);


    }





    @Test
    public void userLogin() {
       /* loginField.sendKeys("hdgs@mail.ru");

        passwordField.sendKeys("zaq1XSW@");

        loginButtin.click();

        writeBtn.click();




        adressToSend.sendKeys("hdgs@mail.ru");
        subjectField.sendKeys("Лаборатория качества");


        driver.switchTo().frame(we);

        driver.findElement(By.id("tinymce")).click();
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("123456");
        driver.switchTo().defaultContent();
        sendBtn.click();

        pages.assertEquals(msgSent.getText().contains("Ваше письмо отправлено"));*/

        pages.autorize("hdgs@mail.ru", "zaq1XSW@");
        pages.clickWriteButton();
        pages.fillAddressToSend("hdgs@mail.ru");
        pages.fillSubject("Тестовая тема для письма");
        pages.fillMsgField("Тестовое сообщение");
        pages.clickSendButton();
        pages.assertEquals(true);

    }
}
