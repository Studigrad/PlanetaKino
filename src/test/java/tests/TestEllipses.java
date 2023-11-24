package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.pages.components.Header;

public class TestEllipses extends TestInit {

    private Header header;

    @BeforeTest
    public void getEllipsesPage() {
        header = new Header(getDriver());
        //  ellipsesPage = new EllipsesPage(getDriver());
    }

    @Test
    public void checkCinemaBtn() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getCinemas().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/theatres/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkCinemaBtn")
    public void checkClubBtn() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getClubBtn().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/club/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkClubBtn")
    public void checkHelpAnswerQuestion() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getHelpAnswersQuestions().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/about/faq/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkHelpAnswerQuestion")
    public void checkDiscount() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getDiscount().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/i/sale/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkDiscount")
    public void checkNews() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getNews().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/events/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkNews")
    public void checkAboutPK() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getAboutPK().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/about/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkAboutPK")
    public void checkJobWithUs() {
        header.getEllipsesBtn().click();
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getJobWithUs().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/about/vacancy/", "Url dont match");
    }

    @Test(dependsOnMethods = "checkJobWithUs")
    public void checkGiftCertificates() {
        Assert.assertTrue(header.getEllipsesBtn().isDisplayed());
        header.getEllipsesBtn().click();
        header.getGiftCertificates().click();
        String getCurentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(getCurentUrl, "https://planetakino.ua/i/gift-certificate/", "Url dont match");
    }
}
