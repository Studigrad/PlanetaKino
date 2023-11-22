package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.pages.HomePage;
import pageObject.pages.components.Header;

public class TestExample extends TestInit {
    /*
      An example of using header elements with two different methods
     */

    private  HomePage homePage;

    @BeforeMethod
    public void openHomePage() {
        homePage = new HomePage(getDriver());
    }
    @Test
    public void example(){
        Header head = new Header(getDriver());
        head.get("Розклад").click();
        head.navigate("https://planetakino.ua/");
        head.getScheduleBtn().click();
    }

    @Test
    public void example2(){
        homePage.clickAtElementList();

    }
}
