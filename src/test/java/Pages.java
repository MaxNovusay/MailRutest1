import org.openqa.selenium.WebDriver;

public class Pages extends Elements {


  public Pages(DriverHelper driverHelper) {
        super(driverHelper);
  }

// Проверки
    public  void assertEquals (Boolean getText) {
        String errMsg = ("Сообщение об отправке отсутствует");
        if (!getText) {
            throw new AssertionError(errMsg);
        }
    }

    /**
     * Метод авторизации
     * @param login - передать логин
     * @param pswd - передать пароль
     */
    public void autorize (String login, String pswd) {
      getLoginField().sendKeys(login);
      getPasswordField().sendKeys(pswd);
      getLoginButton().click();
    }

    /**
     * Метод ввода темы письма
     * @param subject - тема письма
     */
    public void fillSubject (String subject) {
        getSubjectField().sendKeys(subject);
    }

    /**
     * Метод заполнения поля "Кому"
     * @param address - адресс для отправки
     */
    public void fillAddressToSend (String address) {
        getAdressToSend().sendKeys(address);
    }

    /**
     * Метод заполнения поля сообщения
     * @param msg - текст сообщения
     */
    public void fillMsgField (String msg){
        driver.switchTo().frame(getFrameOfMsgBlock());
        getMsgField().clear();
        getMsgField().sendKeys(msg);
    }

    /**
     * Нажать кнопку отправки сообщения
     */
    public void clickSendButton(){
        driver.switchTo().defaultContent();
        getSendBtn().click();
    }

    public void clickWriteButton() {getWriteBtn().click();}

}
