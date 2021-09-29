package ebay;

import google.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    private final static String ADDR = "https://www.ebay.com";
    private final static String SEARCH_FIELD_ID = "gh-ac";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(ADDR);

        WebElement searchField = driver.findElement(By.id(SEARCH_FIELD_ID));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
