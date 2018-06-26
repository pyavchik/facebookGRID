package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    WebDriver driver;
    private static String idUserNavLabel = "userNavigationLabel";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findUserNavigationLabel() {
        return driver.findElement(By.id(idUserNavLabel));
    }

}
