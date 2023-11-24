package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

import java.util.ArrayList;
import java.util.List;

public class GooglePlayPage extends BasePage {
    public GooglePlayPage(WebDriver driver) {
        super(driver);
    }

    public WebElement textGooglePlay() {
        return findByXpath("//h1[@class='Fd93Bb ynrBgc xwcR9d']");
    }

    public void windowGooglePlay() {
        List<String> windowHandlesGoogle = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandlesGoogle.get(1));
    }
}
