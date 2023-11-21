package tests;

import org.testng.annotations.Test;
import pageObject.pages.components.Header;

public class TestExample extends TestInit {
    /*
      An example of using header elements with two different methods
     */
    @Test
    public void example(){
        Header head = new Header(getDriver());
        head.get("Розклад").click();
        head.navigate("https://planetakino.ua/");
        head.getScheduleBtn().click();
    }
}
