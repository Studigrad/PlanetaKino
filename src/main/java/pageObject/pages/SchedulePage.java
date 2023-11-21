package pageObject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

import java.util.List;

public class SchedulePage extends BasePage {
    public SchedulePage(WebDriver driver) {
        super(driver);
    }
    public WebElement openSettings(){
        return findByXpath("//div[@class='h-m__mobile']");
    }
    public WebElement schedule(){
        return findByXpath("//a[@class='h-m__item-link'][text()='Розклад']");
    }
    public WebElement glasses(){
        return findByXpath("//img[@class='img-responsive']");
    }
    public WebElement pageDownBtn(){
        return findByXpath("//div[@class='title'][text()='УСЕ ПРО НАШІ 3D-ОКУЛЯРИ']");
    }
    public SchedulePage openUp(){
        openSettings().click();
        return this;
    }
    public SchedulePage scheduleOpen(){
        schedule().click();
        return this;
    }
    public SchedulePage glassesInfo(){
        glasses().click();
        return this;
    }


}
