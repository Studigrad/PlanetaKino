package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.pages.HomePage;
import pageObject.pages.components.Header;
import pageObject.pages.components.MovieCard;

import java.util.concurrent.TimeUnit;

public class TestExample extends TestInit {
    /*
      An example of using header elements with two different methods
     */
    private  HomePage homePage;
    @BeforeMethod
    public void openHomePage() {
        homePage = new HomePage(getDriver());
    }
//    @Test
//    public void example(){
//        Header head = new Header(getDriver());
//        head.get("Розклад").click();
//        head.navigate("https://planetakino.ua/");
//        head.getScheduleBtn().click();
//    }
    @Test
    public void example(){
        Assert.assertEquals(1,2);
    }

//    @Test
//    public void example2(){
//        MovieCard card = new MovieCard(getDriver());
//        int cardIndex = 2;
//        card.scroll(400);
//        card.hoverCard(cardIndex);
//        Assert.assertEquals(card.getElementsInCard(cardIndex).get(0).getText(),"Бажання");
//        Assert.assertEquals(card.getElementsInCard(cardIndex).get(1).getText(),"жанр\n" +
//                "анімація, сімейний");
//        Assert.assertEquals(card.getElementsInCard(cardIndex).get(2).getText(),"режисер\n" +
//                "Кріс Бак, Фон Верасунторн");
//    }
}
