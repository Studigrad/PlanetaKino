package pageObject.pages.SignInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver){
        super(driver);
    }

    public WebElement signInBtnOnMainPage(){
        return findByXpath("//a[text()='Вхід']");
    }

    public WebElement loginFieldInput(){
        return findByXpath("//input[@id='loginform-login']");
    }

    public WebElement passwordFieldInput(){
        return findByXpath("//input[@id='loginform-password']");
    }

    public WebElement loginBtn(){
        return findByXpath("//button[@name='login-button']");
    }

    public void login(String name, String password ){
        signInBtnOnMainPage().click();
        loginFieldInput().sendKeys(name);
        passwordFieldInput().sendKeys(password);
        loginBtn().click();
    }

}
