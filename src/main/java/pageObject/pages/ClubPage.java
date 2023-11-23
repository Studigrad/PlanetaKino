package pageObject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

public class ClubPage extends BasePage {

    public ClubPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getELPSRegistration(){return findByXpath("//a[@class='container__link'][text()='Реєструйся']");
    }
    public WebElement getELPSBonuses(){return findByXpath("//a[@class='container__link'][text()='Перевірити кількість бонусів']");
    }
    public WebElement getELPSHelp(){return findByXpath("//a[@class='container__link'][text()='Допомога']");
    }
    public WebElement getELPSentEmail(){return findByXpath("");
    }
    public WebElement getELPSGooglePlay(){return findByXpath("//a[@target='_blank'][@class='container__link']");
    }
    public WebElement getELPSAppStore(){return findByXpath("//a[@target='_blank'][@class='container__link container__link_second']");
    }
    public WebElement getELPSContacts(){return findByXpath("//div/a[contains (text(),'Контакти')]");}



}

