package pageObject.pages.SignInPage;

import org.openqa.selenium.By;
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

    public WebElement emailFieldInput(){
        return findByXpath("//input[@id='loginform-login']");
    }

    public WebElement passwordFieldInput(){
        return findByXpath("//input[@id='loginform-password']");
    }

    public WebElement loginBtn(){
        return findByXpath("//button[@name='login-button']");
    }

    public void login(){
        signInBtnOnMainPage().click();
        emailFieldInput().sendKeys("qaengenering@gmail.com");
        passwordFieldInput().sendKeys("QA123456$");
        loginBtn().click();
    }



    public void wrongLogin(){
        signInBtnOnMainPage().click();
        emailFieldInput().sendKeys("qaengenering@gmail.commmm");
        passwordFieldInput().sendKeys("QA123456$");
        loginBtn().click();
    }

    public WebElement warningIncorectDatas(){
        return findByXpath("//p[@class=\"help-block help-block-error login-error-event\"]");
    }

}
