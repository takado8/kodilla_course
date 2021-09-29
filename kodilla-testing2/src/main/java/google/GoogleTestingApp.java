package google;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static final String BUTTON_ACCEPT = "L2AGLb";
    public static final String SEARCHFIELD = "q";                       // [1]

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME); // [2]
        driver.get("https://www.google.com");                                 // [3]

        WebElement button = driver.findElement(By.id(BUTTON_ACCEPT));
        button.click();

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));      // [4]
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
