package pageObject.pages.components;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.BasePage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MovieCard extends BasePage {
    private WebDriverWait wait;
    public MovieCard(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public List <WebElement> getListOfCards(){
        return findsByXpath("//div[@class=\"movie-block__poster-wr\"]");
    }

    public List <WebElement> getListOfCardsBack(){
        return findsByXpath("//div[@class=\"movie-block__flip-back\"]");
    }
    public void hoverCard(int index){
        WebElement cardFront = getListOfCards().get(index-1);
        // Move the mouse over the element
        actions.moveToElement(cardFront).perform();
    }
    public WebElement getBtnByIndexOfCard(int index){
        WebElement cardBack = getListOfCardsBack().get(index-1);
        return wait.until(ExpectedConditions.elementToBeClickable(cardBack.findElement(By.xpath("./span"))));
       // return cardBack.findElement(By.xpath("./span"));
    }
    public List<WebElement> getElementsInCard(int index){
        WebElement cardBack = getListOfCardsBack().get(index-1);
        return cardBack.findElements(By.xpath("./a/div"));
    }


}
