package tests.SignInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.SignInPage;
import tests.TestInit;

public class SignIn extends TestInit {
    @Test
    public void signInPositive() {
        SignInPage signIn = new SignInPage(getDriver());

        signIn.login("","");

        Assert.assertTrue(signIn.findByXpath("//div[text()='q']").isDisplayed());

    }
}
