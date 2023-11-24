package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class DeluxPage extends BasePage {
    public DeluxPage(WebDriver driver) {
        super(driver);
    }

  public WebElement imgDelux(){
        return findByXpath("//img[@id='relux-logo']");
  }
}
