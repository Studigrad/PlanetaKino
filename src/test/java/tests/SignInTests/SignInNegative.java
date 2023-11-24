package tests.SignInTests;

import jdk.jfr.Percentage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.SignInPage;
import tests.TestInit;

public class SignInNegative extends TestInit {

    @Test
    public void SignInWithWrongEmail() {
        SignInPage signIn = new SignInPage(getDriver());

        signIn.login("qaengenering@gmail.comM","QA123456%");

        Assert.assertTrue(signIn.warningIncorectCredetians().isDisplayed());

    }
}