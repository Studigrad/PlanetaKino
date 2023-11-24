package pageObject.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

import java.util.List;

public class Footer extends BasePage {
    public Footer(WebDriver driver) {
        super(driver);
    }

    public WebElement getContactBtn() {
        return findByXpath("//div[@class='footer-btn']");
    }

    public WebElement getTermsAndConditionsOfPlanetCinemaBtn() {
        return findByXpath("(//div[@class='footer-rules'])[1]");
    }

    public WebElement getSiteMapBtn() {
        return findByXpath("//div[@class='sitemap']");
    }

    public WebElement getAppStoreBtn() {
        return findByXpath("(//div[@class='app-img'])[1]");
    }

    public WebElement genGooglePlayBtn() {
        return findByXpath("(//div[@class='app-img'])[2]");
    }

    public List<WebElement> getSocialMediaBtn() {
        return findsByXpath("//div[@class='social-img']");
    }

    public WebElement getDevelopedAndMaintainedBtn() {
        return findByXpath("//div[@class='site-development']");
    }

}