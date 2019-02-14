import org.junit.BeforeClass;
import org.junit.Test;


public class MailRuTest {

    private static DriverHelper driverHelper;
    private static Pages pages;

    @BeforeClass
    public static void initialize() {
        driverHelper = new DriverHelper();
        pages = new Pages(driverHelper);

    }


    @Test
    public void checkMailWriting() {

        pages.autorize("lab_83@bk.ru", "6yhn&UJM");
        pages.clickWriteButton();
        pages.fillAddressToSend("lab_83@bk.ru");
        pages.fillSubject("Тестовая тема для письма");
        pages.fillMsgField("Тестовое сообщение");
        pages.clickSendButton();
        pages.assertSuccessMsgPresent();
        driverHelper.close();

    }
}
