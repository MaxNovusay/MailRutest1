import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {

    DriverHelper driver;

    public Elements(DriverHelper driverHelper) {
        this.driver = driverHelper;
    }




    /**
     * Получение поля "логин"
     * @return объект класса WebElement
     */
    By getLoginField = By.id("mailbox:login");

    /**
     * Получение поля "пароль"
     * @return объект класса WebElement
     */
    By getPasswordField = By.id("mailbox:password");

    /**
     * Получение кнопки "войти"
     * @return объект класса WebElement
     */
    By getLoginButton = By.xpath(".//input[@value = 'Войти']");

    /**
     * Получение кнопки "написать сообщение"
     * @return объект класса WebElement
     */
    By getWriteBtn = By.cssSelector("a[data-name='compose']");

    /**
     * Получение поля "Тема письма"
     * @return объект класса WebElement
     */
    By getSubjectField = By.cssSelector("input[name^='Subject']");

    /**
     * Получение поля "Кому"
     * @return объект класса WebElement
     */
    By getAdressToSend = By.cssSelector("textarea[data-original-name^='To']");


    /**
     * Получение кнопки "Отправить"
     * @return объект класса WebElement
     */
    By getSendBtn =  By.cssSelector("div[data-name='send']");


    /**
     * Получение iframe c блоком для набора текста сообщения
     * @return объект класса WebElement
     */
    By  getFrameOfMsgBlock = By.xpath("//iframe[starts-with(@id,'toolkit')]");


    /**
     * Получение поля набора текста сообщения
     * @return объект класса WebElement
     */
    By getMsgField = By.id("tinymce");


    /**
     * получение блока с сообщением об успешной отправке
     */
    By getMsgSent = By.className("message-sent__title");

}
