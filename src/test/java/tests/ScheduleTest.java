package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.SchedulePage;

import java.time.Duration;
import java.util.List;

public class ScheduleTest extends TestInit {

    @Test
    public void scheduleOpen(){
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
    }
    @Test
    public void glassesPage(){
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.textVisible();
        Assert.assertTrue(sch.textVisible().isDisplayed());
    }
    @Test
    public void tomorrowF(){
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.tomorrowFilter();
    }
    @Test
    public void weekF(){
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.weekFilter();
    }
    @Test
    public void monthF(){
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.monthFilter();
    }
    @Test
    public void dxF() {
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.dxFilter();
    }
    @Test
    public void allBtns() throws InterruptedException {
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.allButtons();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        List<WebElement> visibleElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//section[@class='movie-info flex-column']")));
        Assert.assertTrue((visibleElements.size()) > 0);
    }
    @Test
    public void allTime(){
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.timeMovies();
    }
    @Test
    public void allPeriods() throws InterruptedException {
        SchedulePage sch = new SchedulePage(getDriver());
        sch.openSchedule();
        sch.periodTime();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        List<WebElement> visibleElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//section[@class='movie-info flex-column']")));
        Assert.assertTrue((visibleElements.size()) > 0);
    }
}


