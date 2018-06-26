import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by pyavchik on 26.06.2018.
 */
public class BaseTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void beforeTest(String browser) throws MalformedURLException {


        DesiredCapabilities cap;

        if(browser.equals("firefox")){
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.ANY);
        } else if (browser.equals("chrome")){
            cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.ANY);
        } else if (browser.equals("safari")){
            cap = DesiredCapabilities.safari();
            cap.setBrowserName("safari");
            cap.setPlatform(Platform.ANY);
        } else {
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.ANY);
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
