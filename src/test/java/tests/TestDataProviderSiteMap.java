package tests;

import org.testng.annotations.DataProvider;

public class TestDataProviderSiteMap extends TestInit {
    @DataProvider(name = "test")
    public Object[][] testData() {
        return new Object[][]{
                {"Головна сторiнка"},
                {"Розклад"},
                {"Фільми"},
                {"4DX"},
                {"Ціни квитків у Києві (Blockbuster)"},
                {"Ціни квитків у Києві (River Mall)"},
                {"Ціни квитків в Одесі (City Center Таїрова)"},
                {"Ціни квитків в Одесі (City Center Котовський)"},
                {"Ціни квитків у Львові (Leoland)"},
                {"Ціни квитків у Львові (Leoland)"},
                {"Ціни квитків у Львові (ТРЦ «Forum Lviv»)"},
                {"Ціни квитків у Харкові"},
                {"Ціни квитків у Сумах"},
                {"Ціни квитків у Дніпрі"},
                {"Клуб"},
                {"Знижки"},
                {"Подарункові сертифікати"}
        };
    }
}
