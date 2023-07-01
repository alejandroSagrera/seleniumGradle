package pages;

public class GooglePage extends BasePage{

    public GooglePage() {
        super(driver);
        
    }
    public void navigateTo() {
        navigateTo("https://www.google.com");
    }
}
