package pages;

public class GooglePage extends BasePage {

    private String searchBtn = "(//input[@name='btnK'])[2]";
    private String inputSearch = "//textarea[@id='APjFqb']";

    public GooglePage() {
        super(driver);

    }

    public void navigateTo() {
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch() {
        clickElement(searchBtn);
    }

    public void enterSearchCriteria(String criteria) {
        write(inputSearch, criteria);
    }

    public String getElementText(String locator) {
        return textFromElement(locator);
    }
}
