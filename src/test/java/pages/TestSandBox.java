package pages;

public class TestSandBox extends BasePage {
    private String cell = "//*[@id='root']/div/";

    public TestSandBox() {
        super(driver);
    }

    public void navigateToGrid() {
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getValueFromGrid(int row, int column) {
        return getValueFromTable(cell, row, column);
    }

    public void setValueToGrid(int row, int column, String data) {
        setValueOnTable(cell, row, column, data);

    }

}
