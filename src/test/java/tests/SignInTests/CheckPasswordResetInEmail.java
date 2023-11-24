package tests.SignInTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.SignInPage;
import tests.TestInit;

public class CheckPasswordResetInEmail extends TestInit {

    @Test
    public void CheckMessageAboutPasswordResetInEmail() {
        SignInPage signIn = new SignInPage(getDriver());

        signIn.checkLetterWithMessageFromPlanetaKinoInEmailAboutPasswordReset();

        Assert.assertTrue(signIn.messageAboutResetPasswordFromPlanetaKino().isDisplayed());
    }
}
