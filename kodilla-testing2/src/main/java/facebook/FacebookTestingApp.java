package facebook;


import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {

    public static final String XPATH_BUTTON = "/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]";
    public static final String XPATH_CREATE = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String BIRTHDAY = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String MONTH_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
    public static final String YEAR_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_BUTTON)).isDisplayed()) ;

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_BUTTON));
        acceptCookies.click();

        while (!driver.findElement(By.xpath(XPATH_CREATE)).isDisplayed()) ;
        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE));

        createAccount.click();

        Thread.sleep(2000L);
        while (!driver.findElement(By.xpath(BIRTHDAY)).isDisplayed()) ;
        WebElement setBirthday = driver.findElement(By.xpath(BIRTHDAY));

        setBirthday.click();
        Select selectDay = new Select(setBirthday);
        selectDay.selectByVisibleText("16");

        WebElement setMonth = driver.findElement(By.xpath(MONTH_OF_BIRTH));
        setBirthday.click();
        Select selectMonth = new Select(setMonth);
        selectMonth.selectByVisibleText("cze");

        WebElement setYear = driver.findElement(By.xpath(YEAR_OF_BIRTH));
        setYear.click();
        Select selectYear = new Select(setYear);
        selectYear.selectByVisibleText("1993");
    }
}