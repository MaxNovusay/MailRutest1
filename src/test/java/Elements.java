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
    public WebElement getLoginField() {
        return driver.findElement(By.id("mailbox:login"));
    }

    /**
     * Получение поля "пароль"
     * @return объект класса WebElement
     */
    public WebElement getPasswordField() {
        return driver.findElement(By.id("mailbox:password"));
    }

    /**
     * Получение кнопки "войти"
     * @return объект класса WebElement
     */
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(".//input[@value = 'Войти']"));
    }

    /**
     * Получение кнопки "написать сообщение"
     * @return объект класса WebElement
     */
    public WebElement getWriteBtn() {
        return driver.findElement(By.cssSelector("a[data-name='compose']"));
    }

    /**
     * Получение поля "Тема письма"
     * @return объект класса WebElement
     */
    public WebElement getSubjectField() {
        return driver.findElement(By.cssSelector("input[name^='Subject']"));
    }

    /**
     * Получение поля "Кому"
     * @return объект класса WebElement
     */
    public WebElement getAdressToSend() {
        return driver.findElement(By.cssSelector("textarea[data-original-name^='To']"));
    }

    /**
     * Получение кнопки "Отправить"
     * @return объект класса WebElement
     */
    public WebElement getSendBtn() {
        return  driver.findElement(By.cssSelector("div[data-name='send']"));
    }

    /**
     * Получение iframe c блоком для набора текста сообщения
     * @return объект класса WebElement
     */
    public WebElement getFrameOfMsgBlock() {
        return driver.findElement(By.xpath("//iframe[starts-with(@id,'toolkit')]"));
    }

    /**
     * Получение поля набора текста сообщения
     * @return объект класса WebElement
     */
    public WebElement getMsgField() {
        return driver.findElement(By.id("tinymce"));
    }

    /**
     * Получение блока с сообщением об успешной отправке сообщения
     * @return объект класса WebElement
     */
    public WebElement getSuccessValidation(){
        return driver.findElement(By.cssSelector("div.message-sent__title"));
    }

}
