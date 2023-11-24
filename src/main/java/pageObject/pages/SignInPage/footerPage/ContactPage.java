package pageObject.pages.SignInPage.footerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class ContactPage extends BasePage {
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public WebElement telegramBtn() {
        return findByXpath("//div[@class='ct-mess__title ct-mess_type_tele']");
    }

    public WebElement viberBtn() {
        return findByXpath("//div[@class='ct-mess__title ct-mess_type_viber']");
    }

    public WebElement messengerBtn() {
        return findByXpath("//div[@class='ct-mess__title ct-mess_type_mess']");
    }
}
