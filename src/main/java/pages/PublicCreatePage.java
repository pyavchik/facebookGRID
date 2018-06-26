package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PublicCreatePage {
    WebDriver driver;
    private final String PUBLIC_CREATE_PAGE_URL = "https://www.facebook.com/pages/creation/?ref_type=logout_gear";

    public PublicCreatePage(WebDriver driver) {
        this.driver = driver;
    }

    private static String xpathCompanyCreatButton = "//button[@data-testid='NON_BUSINESS_SUPERCATEGORYSelectButton']";
    private static String xpathPublicCreateButton = "//button[@data-testid='BUSINESS_SUPERCATEGORYSelectButton']";

    public void open(){
        driver.get(PUBLIC_CREATE_PAGE_URL);
    }

    public boolean publicCreatPageAvailable(){
        if (findBeginButtonForCompany().isDisplayed()&&findBeginButtonForPublic().isDisplayed()){
            return true;
        } else {
            return false;
        }

    }

    private WebElement findBeginButtonForCompany() {
        return driver.findElement(By.xpath(xpathCompanyCreatButton));
    }

    private WebElement findBeginButtonForPublic() {
        return driver.findElement(By.xpath(xpathPublicCreateButton));
    }

}
