package pageObject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> filmlist() {
        return findsByXpath("//div[@class='movie-block__poster-wr']");

    }
    public WebElement getElementFromFilmList(){
        return filmlist().get(generateRandomNumber(0, filmlist().size()));
    }
   public FilmPage clickAtElementList(){
        getElementFromFilmList().click();
        return new FilmPage();
   }




}
