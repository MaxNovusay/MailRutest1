import org.openqa.selenium.WebDriver;

public class Pages extends Elements {


  public Pages(DriverHelper driverHelper) {
        super(driverHelper);
  }

  //---------Проверка--------

    /**
     * Проверка наличия сообщения об отправке
     */
    public  void assertSuccessMsgPresent() {
        String errMsg = ("Сообщение об отправке отсутствует");
        Boolean getText = driver.findElement(getMsgSent).getText().contains("Ваше письмо отправлено");
        if (!getText) {
            throw new AssertionError(errMsg);
        }
    }

    //------Заполнение полей
    /**
     * Метод авторизации
     * @param login - передать логин
     * @param pswd - передать пароль
     */
    public void autorize (String login, String pswd) {
        driver.findElement(getLoginField).sendKeys(login);
        driver.findElement(getPasswordField).sendKeys(pswd);
        driver.findElement(getLoginButton).click();
    }

    /**
     * Метод ввода темы письма
     * @param subject - тема письма
     */
    public void fillSubject (String subject) {
        driver.findElement(getSubjectField).sendKeys(subject);
    }

    /**
     * Метод заполнения поля "Кому"
     * @param address - адресс для отправки
     */
    public void fillAddressToSend (String address) {
        driver.findElement(getAdressToSend).sendKeys(address);
    }

    /**
     * Метод заполнения поля сообщения
     * @param msg - текст сообщения
     */
    public void fillMsgField (String msg){
        driver.switchTo().frame(driver.findElement(getFrameOfMsgBlock));
        driver.findElement(getMsgField).clear();
        driver.findElement(getMsgField).sendKeys(msg);
    }

    //-------Нажатие кнопок
    /**
     * Нажатие кнопку отправки сообщения
     */
    public void clickSendButton(){
        driver.switchTo().defaultContent();
        driver.findElement(getSendBtn).click();
    }

    /**
     * Нажатие кнопки "Написать"
     */
    public void clickWriteButton() { driver.findElement(getWriteBtn).click();}

}
