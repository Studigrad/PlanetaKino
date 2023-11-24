package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import pageObject.BasePage;

import java.util.ArrayList;
import java.util.List;

public class TermsAndConditionsPage extends BasePage {
    public TermsAndConditionsPage(WebDriver driver) {
        super(driver);
    }

    public void windowTermsAndConditions() {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
    }
}