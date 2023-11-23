package tests.SignInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.SignInPage;
import tests.TestInit;

public class SignIn extends TestInit {
    @Test
    public void signInPositive() {
        SignInPage signIn = new SignInPage(getDriver());

        signIn.login("qaengenering@gmail.com","QA123456$");

        Assert.assertTrue(signIn.userAvatar().isDisplayed());

    }////span[text()='Ми чули, тобі потрібен новий пароль']
}
