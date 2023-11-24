package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class SiteMapPage extends BasePage {
    public SiteMapPage(WebDriver driver) {
        super(driver);
    }

    public String expectedUrl = "https://planetakino.ua/sitemap/";
    public String actualUrl;

    public WebElement glassesBtn() {
        return findByXpath("//a[contains(text(),'окуляри')]");
    }

    public WebElement textSiteMap() {
        return findByXpath("//h2[@class='sitemapTitle']");
    }

    public WebElement deluxBtn() {
        return findByXpath(" //h2/a[contains(text(),'LUX ')]");
    }

    public WebElement cinetechBtn() {
        return findByXpath("//h2/a[text()='Cinetech+']");
    }

    public void checkSiteMapDataProvider(String categoryName) {
        WebElement categoryLink = driver.findElement(By.linkText(categoryName));
        categoryLink.click();
        actualUrl = driver.getCurrentUrl();
    }
}
