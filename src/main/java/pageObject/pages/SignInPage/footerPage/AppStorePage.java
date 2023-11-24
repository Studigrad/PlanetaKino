package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

import java.util.ArrayList;
import java.util.List;

public class AppStorePage extends BasePage {
    public AppStorePage(WebDriver driver) {
        super(driver);
    }

    public WebElement textAppStore() {
        return findByXpath("//a[@class='link'][text()='Planeta Kino IMAX']");
    }

    public void windowAppStore() {
        List<String> windowHandlesApp = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandlesApp.get(1));
    }
}
