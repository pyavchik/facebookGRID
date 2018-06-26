package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    private final String LOGIN_PAGE_URL = "https://www.facebook.com/";

    private String idEmailFl = "email";
    private String idPassFl = "pass";
    private String xpathSubmitBtn = "//input[@type='submit']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(LOGIN_PAGE_URL);
    }

    public void doLogin(String login, String password){
        findEmailFl(driver).sendKeys(login);
        findPassFl(driver).sendKeys(password);
        findSubmitBtn(driver).click();
    }

    private WebElement findEmailFl(WebDriver driver){
        return  driver.findElement(By.id(idEmailFl));
    }

    private WebElement findPassFl(WebDriver driver){
        return driver.findElement(By.id(idPassFl));
    }

    private WebElement findSubmitBtn(WebDriver driver) {
        return driver.findElement(By.xpath(xpathSubmitBtn));
    }
}
