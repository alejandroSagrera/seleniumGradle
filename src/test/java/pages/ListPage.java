package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;

public class ListPage extends BasePage {
    private String searchField = "//form[@action='/weather/']//input[@placeholder='Search for city or place…']";
    private String searchResults = "/html/body/div[2]/div/ul/li/a/span[@class='mnx']";

    public ListPage() {
        super(driver);
    }

    public void navigateTo() {
        navigateTo("https://www.timeanddate.com/");
    }

    public void enterSearchCriteria() throws InterruptedException {
        Thread.sleep(600);
        write(searchField, "Montevideo");

    }

    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();
        for (WebElement e : list) {
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }

}
