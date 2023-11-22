package tests.SignInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.SignInPage;
import tests.TestInit;

public class SignInNegative extends TestInit {

    @Test
    public void SignInWithWrongEmail() {
        SignInPage signIn = new SignInPage(getDriver());

        signIn.wrongLogin();

        Assert.assertTrue(signIn.warningIncorectDatas().isDisplayed());

    }
}