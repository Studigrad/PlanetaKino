package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.pages.SignInPage.footerPage.*;
import pageObject.pages.components.Footer;

public class TestFooter extends TestInit {

    private Footer footer;
    private ContactPage contactPage;
    private TermsAndConditionsPage termsAndConditionsPage;
    private SiteMapPage siteMapPage;
    private GlassesPage glassesPage;
    private DeluxPage deluxPage;
    private CinetechPage cinetechPage;
    private AppStorePage appStorePage;
    private GooglePlayPage googlePlayPage;

    @BeforeMethod
    public void openFooter() {

        footer = new Footer(getDriver());
        contactPage = new ContactPage(getDriver());
        termsAndConditionsPage = new TermsAndConditionsPage(getDriver());
        siteMapPage = new SiteMapPage(getDriver());
        glassesPage = new GlassesPage(getDriver());
        deluxPage = new DeluxPage(getDriver());
        cinetechPage = new CinetechPage(getDriver());
        appStorePage = new AppStorePage(getDriver());
        googlePlayPage = new GooglePlayPage(getDriver());
    }

    @Test
    public void checkContactBtn() {
        footer.getContactBtn().click();

        Assert.assertNotNull(contactPage.telegramBtn(), "Telegram button is not present");
        Assert.assertNotNull(contactPage.viberBtn(), "Viber button is not present");
        Assert.assertNotNull(contactPage.messengerBtn(), "Messenger button is not present");
    }

    @Test
    public void checkTermsAndConditionsOfPlanetCinema() {
        footer.getTermsAndConditionsOfPlanetCinemaBtn().click();
        termsAndConditionsPage.windowTermsAndConditions();
        String actualUrl = getDriver().getCurrentUrl();
        String expectedUrl = "https://planetakino.ua/r/0ed7d92619c64a7f91713bc64a81ab61/RULES_PK_UA.pdf";

        Assert.assertEquals(actualUrl, expectedUrl, "URLs don't match");
    }

    @Test
    public void checkSiteMap() {
        footer.getSiteMapBtn().click();

        Assert.assertTrue(siteMapPage.textSiteMap().getText().contains("Карта сайту:"));
    }

    @Test(dataProvider = "test", dataProviderClass = TestDataProviderSiteMap.class)
    public void dataTestCheckSiteMap(String categoryName) {
        footer.getSiteMapBtn().click();
        siteMapPage.checkSiteMapDataProvider(categoryName);
        System.out.println(siteMapPage.actualUrl);

        Assert.assertNotEquals(siteMapPage.actualUrl, siteMapPage.expectedUrl);
    }

    @Test
    public void checkGlasses() {
        footer.getSiteMapBtn().click();
        siteMapPage.glassesBtn().click();

        Assert.assertTrue(glassesPage.textGlasses().getText().contains("УСЕ ПРО НАШІ 3D-ОКУЛЯРИ"));
    }

    @Test
    public void checkDelux() {
        footer.getSiteMapBtn().click();
        siteMapPage.deluxBtn().click();

        Assert.assertTrue(deluxPage.imgDelux().isDisplayed());
    }

    @Test
    public void checkCinetech() {
        footer.getSiteMapBtn().click();
        siteMapPage.cinetechBtn().click();

        Assert.assertTrue(cinetechPage.imgCinetech().isDisplayed());
    }

    @Test
    public void checkAppStore() {
        footer.getAppStoreBtn().click();
        appStorePage.windowAppStore();

        Assert.assertTrue(appStorePage.textAppStore().isDisplayed());
    }

    @Test
    public void checkGooglePlay() {
        footer.genGooglePlayBtn().click();
        googlePlayPage.windowGooglePlay();

        Assert.assertTrue(googlePlayPage.textGooglePlay().isDisplayed());
    }
}


