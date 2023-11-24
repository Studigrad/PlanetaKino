package tests.SignInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.SignInPage;
import pageObject.pages.SignInPage.SignUpPage;
import tests.TestInit;

public class SignUpNegative extends TestInit {

    @Test
    public void CheckSignUpNegative() {
        SignUpPage signUpPage = new SignUpPage(getDriver());

        signUpPage.checkSignUpNegative("email@ggmmaaiill..ccoomm");

        Assert.assertTrue(signUpPage.wrongTypeInputEmail().isDisplayed());
    }
}
