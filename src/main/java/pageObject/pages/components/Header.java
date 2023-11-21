package pageObject.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Header extends BasePage {
    private Map<String, WebElement> map = new HashMap<>();
    private String [] arr = {
            "Розклад",
            "Фільми",
            "RELUX",
            "IMAX",
            "4DX",
            "Cinetech",
            "ЩОСЬ",
            "Контакти",
            "Клуб",
            "Кінотеатри",
            "Допомога",
            "Знижки",
            "Сертифікати"
    };
    public Header(WebDriver driver) {
        super(driver);
        addElementsInMap();
    }
    public void addElementsInMap(){
        List<WebElement> list = findsByXpath("//ul[@class=\"h-m__desktop\"]/li");
        int i=0;
        for (WebElement el : list){
            map.put(arr[i],el);
            i++;
        }
    }
    public WebElement get(String str){
        return map.get(str);
    }
    public WebElement getScheduleBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[1]");
    }
    public WebElement getMoviesBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[2]");
    }
    public WebElement getReluxBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[3]");
    }
    public WebElement getImaxBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[4]");
    }
    public WebElement get4dxBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[5]");
    }
    public WebElement getCinetechBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[6]");
    }
    public WebElement getSomethingBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[7]");
    }
    public WebElement getContactsBtn(){
        return findByXpath("//ul[@class=\"h-m__desktop\"]/li[8]");
    }
}
