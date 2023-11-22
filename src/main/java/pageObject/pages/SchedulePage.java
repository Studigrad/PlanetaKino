package pageObject.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pageObject.BasePage;

import java.util.List;

public class SchedulePage extends BasePage {
    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    public WebElement schedule() {
        return findByXpath("//a[@class='h-m__item-link'][text()='Розклад']");
    }

    public WebElement textVisible() {
        return findByXpath("//h1[@class='page-title col-sm-9 col-xs-12']");
    }

    public WebElement today() {
        return findByXpath("//a[@class='tablet-movie-name link-text']");
    }

    public WebElement tomorrow() {
        return findByXpath("//div[@class='mat-radio-label-content'][text()=' завтра ']");
    }

    public WebElement week() {
        return findByXpath("//div[@class='mat-radio-label-content'][text()=' тиждень ']");
    }

    public WebElement month() {
        return findByXpath("//div[@class='mat-radio-label-content'][text()=' місяць ']");
    }

    public WebElement DX() {
        return findByXpath("//span[@class='mat-checkbox-label'][text()=' 4DX ']");
    }

    public List<WebElement> allBtn() {
        return findsByXpath("//span[@class='mat-checkbox-label']");
    }

    public List<WebElement> movies() {
        return findsByXpath("//section[@class='movie-info flex-column']");
    }

    public List<WebElement> time() {
        return findsByXpath("//button[@tooltip-class='chip__tooltip'][text()='20:00 ']");
    }
    public List<WebElement> period(){
        return findsByXpath("//label[@class='mat-radio-label']");
    }


    public SchedulePage openSchedule() {
        schedule().click();
        return this;
    }

    public SchedulePage tomorrowFilter() {
        tomorrow().click();
        return this;
    }

    public SchedulePage weekFilter() {
        week().click();
        return this;
    }

    public SchedulePage monthFilter() {
        month().click();
        return this;
    }

    public SchedulePage dxFilter() {
        DX().click();
        return this;
    }

    public SchedulePage allButtons() throws InterruptedException {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//span[@class='mat-checkbox-label']"));
        Actions actions = new Actions(driver);
        for (int i = 0; i < checkboxes.size(); i++) {
            try {
                checkboxes.get(i).click();
                if (i > 0) {
                }
                Thread.sleep(1000);
                actions.sendKeys(Keys.SPACE).release().perform();
            } catch (StaleElementReferenceException e) {
                checkboxes = driver.findElements(By.xpath("//span[@class='mat-checkbox-label']"));
                checkboxes.get(i).click();
                if (i > 0) {
                }
                Thread.sleep(1000);
                actions.sendKeys(Keys.SPACE).release().perform();
            }
        }
        return this;
    }

    public SchedulePage timeMovies() {
        for (WebElement button : time()) {
            boolean isClickable = isElementClickable(button);
            System.out.println("Button is clickable: " + isClickable);
        }
        return this;
    }
    private boolean isElementClickable(WebElement button) {
        try {
            button.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public SchedulePage periodTime() throws InterruptedException {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//label[@class='mat-radio-label']"));
        Actions actions = new Actions(driver);
        int i = 0;
        for (i = 0; i < checkboxes.size(); i++) {
            period().get(i).click();
            Thread.sleep(1000);
            actions.sendKeys(Keys.SPACE).release().perform();
        }
        return this;
    }
    }





