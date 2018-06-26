import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;
import static utils.PropertiesClass.getPropertyValue;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);
        loginPage.open();
        loginPage.doLogin(getPropertyValue("login"), getPropertyValue("password"));
        assertEquals(mainPage.findUserNavigationLabel().isDisplayed(), true);
    }

}
