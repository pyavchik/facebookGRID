import org.testng.annotations.Test;
import pages.AdvertisingPage;
import pages.LoginPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;
import static utils.PropertiesClass.getPropertyValue;

public class CreateAdvertisingTest extends BaseTest {

    @Test
    public void createAdvertisingTest() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);
        AdvertisingPage advertisingPage = new AdvertisingPage(driver);

        loginPage.open();
        loginPage.doLogin(getPropertyValue("login"), getPropertyValue("password"));
        assertEquals(mainPage.findUserNavigationLabel().isDisplayed(), true);
        advertisingPage.open();
        assertEquals(advertisingPage.isAdsManagerButtonAvailable(), true);
    }
}
