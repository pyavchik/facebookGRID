import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    public void beforeTest(@Optional("firefox") String browser) throws MalformedURLException {

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
            cap.setPlatform(Platform.MAC);
        } else {
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.ANY);
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterTest(){
        driver.quit();
    }
}
