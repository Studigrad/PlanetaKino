package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class CinetechPage extends BasePage {
    public CinetechPage(WebDriver driver) {
        super(driver);
    }
    public WebElement imgCinetech(){
        return findByXpath("(//div[@class='cine_section_0-title'])[1]");
    }
}
