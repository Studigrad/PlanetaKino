package pageObject.pages.SignInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement signUpBtnOnMainPage(){
        return findByXpath("//a[@class=\"register-link\"]");
    }

    public WebElement signUpEmailField(){
        return findByXpath("//input[@id=\"signupform-email\"]");
    }

    public WebElement signUpPasswordField(){
        return findByXpath("//input[@id=\"signupform-phone\"]");
    }

    public WebElement signUpPasswordFieldAgain(){
        return findByXpath("//input[@id=\"signupform-password\"]");
    }

    public void checkSignUpNegative(String email){
        signUpBtnOnMainPage().click();
        signUpEmailField().sendKeys(email);
        signUpPasswordField().click();
    }

    public WebElement wrongTypeInputEmail(){
        return findByXpath("//p[text()='Не вірний формат e-mail']");
    }
}
