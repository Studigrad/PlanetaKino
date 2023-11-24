package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class GlassesPage extends BasePage {
    public GlassesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement textGlasses() {
        return findByXpath(" //div[@class='title'][text()='УСЕ ПРО НАШІ 3D-ОКУЛЯРИ']");
    }
}
