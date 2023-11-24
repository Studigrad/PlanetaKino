package pageObject.pages.SignInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement signInBtnOnMainPage() {
        return findByXpath("//a[text()='Вхід']");
    }

    public WebElement emailFieldInput() {
        return findByXpath("//input[@id='loginform-login']");
    }

    public WebElement passwordFieldInput() {
        return findByXpath("//input[@id='loginform-password']");
    }

    public WebElement loginBtn() {
        return findByXpath("//button[@name='login-button']");
    }

    public WebElement userAvatar() {
        return findByXpath("//div[text()='q']");
    }

    public void login(String email, String password) {
        signInBtnOnMainPage().click();
        emailFieldInput().sendKeys(email);
        passwordFieldInput().sendKeys(password);
        loginBtn().click();
    }

<<<<<<< HEAD
    public void wrongLogin(){
        signInBtnOnMainPage().click();
        emailFieldInput().sendKeys("qaengenering@gmail.commmm");
        passwordFieldInput().sendKeys("QA123456$");
        loginBtn().click();
    }

    public WebElement warningIncorectDatas(){
=======
    public WebElement warningIncorectCredetians() {
>>>>>>> 51210da6118c4770427547dd0e27a91569fdaad9
        return findByXpath("//p[@class=\"help-block help-block-error login-error-event\"]");
    }

    public void checkLetterWithMessageFromPlanetaKinoInEmailAboutPasswordReset() {
        signInBtnOnMainPage().click();
        resetPasswordBtn().click();
        resetPasswordBtnField().sendKeys("qaengenering@gmail.com");
        sendCodeOnEmailOrPhoneBtn().click();
        driver.get("https://www.google.com/gmail/about/");
        driver.findElement(By.xpath("//div[@class=\"header__aside__buttons\"]/a[@data-action=\"sign in\"]")).click();
//        driver.switchTo().newWindow(WindowType.TAB).get("");
        emailSignInField().sendKeys("qaengenering@gmail.com");
        furtherBtnOnEmailPage().click();
        retryInputEmail().click();
        emailSignInField().sendKeys("qaengenering@gmail.com");
        furtherBtnOnEmailPage().click();
        passwordFieldOnEmailPage().sendKeys("QA123456");
        furtherBtnOnEmailPage().click();
    }

    public WebElement resetPasswordBtn() {
        return findByXpath("//a[@class=\"link-to-restore\"]");
    }

    public WebElement resetPasswordBtnField() {
        return findByXpath("//input[@id=\"passwordresetform-data\"]");
    }

    public WebElement sendCodeOnEmailOrPhoneBtn() {
        return findByXpath("//button[@id=\"send_code_\"]");
    }

    public WebElement emailSignInField(){
        return findByXpath("//input[@type=\"email\"]");
    }

    public WebElement retryInputEmail(){
        return findByXpath("//a[@aria-label=\"Повторити спробу\"]");
    }

    public WebElement furtherBtnOnEmailPage(){
        return findByXpath("//span[text()='Далі']");
    }

    public WebElement passwordFieldOnEmailPage(){
        return findByXpath("//input[@type=\"password\"]");
    }

    public WebElement messageAboutResetPasswordFromPlanetaKino(){
        return findByXpath("//font[text()='Ми чули, тобі потрібен новий пароль'][1]");
    }

}
