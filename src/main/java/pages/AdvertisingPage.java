package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertisingPage {
    WebDriver driver;
    private final String ADVERTISING_CREATE_PAGE_URL = "https://www.facebook.com/adsmanager/creation";
    private static String xpathAdsManagerButton = "//span[@class='_3r7u']";

    public AdvertisingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(ADVERTISING_CREATE_PAGE_URL);
    }

    public boolean isAdsManagerButtonAvailable(){
        if(findAdsManagerButton().isDisplayed()){
            return true;
        } else {
            return false;
        }
    }

    private WebElement findAdsManagerButton() {
        return driver.findElement(By.xpath(xpathAdsManagerButton));
    }


}
