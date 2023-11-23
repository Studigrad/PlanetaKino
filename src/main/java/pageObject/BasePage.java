package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigate(String link) {
        driver.get(link);
    }

    public WebElement findByXpath(String path) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
    }

    public List<WebElement> findsByXpath(String path) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
    }

    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

    public WebElement findByCSS(String path) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(path)));
    }

    public List<WebElement> findsByCSS(String path) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(path)));
    }

    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Минимальное значение должно быть меньше или равно максимальному значению");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }


}