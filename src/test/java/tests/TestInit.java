package tests;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class TestInit {
    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    @BeforeTest
    public void openBrowser() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
        Capabilities cap = new ChromeOptions();
        String urlFormat = "http://%s:4444/wd/hub";
        String hubHost = "192.168.68.161";
        String url = String.format(urlFormat,hubHost);
        driver.set(new RemoteWebDriver(new URL(url),cap));
        getDriver().get("https://eatstreet.com");

    }
    public WebDriver getDriver(){
        return driver.get();
    }
    @AfterTest
    public void closeBrowser(){
        getDriver().quit();
    }
}
