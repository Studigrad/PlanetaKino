package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public abstract class TestInit {
    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    @BeforeTest
    public void openBrowser() throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        Capabilities cap = new ChromeOptions();
//        String urlFormat = "http://%s:4444/wd/hub";
//        String hubHost = "192.168.68.161";
//        String url = String.format(urlFormat,hubHost);
//        driver.set(new RemoteWebDriver(new URL(url),cap));
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().get("https://planetakino.ua/");
    }
    public WebDriver getDriver(){
        return driver.get();
    }
    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                    + Arrays.toString(testResult.getParameters()) +  ".jpg"));
        }
    }

    @AfterTest
    public void closeBrowser(){
        getDriver().quit();
    }
}
