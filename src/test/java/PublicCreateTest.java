import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PublicCreatePage;

import static org.testng.Assert.assertEquals;
import static utils.PropertiesClass.getPropertyValue;

public class PublicCreateTest extends BaseTest{

    @Test
    public void createPublicGroupTest(){
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);
        PublicCreatePage publicCreatePage = new PublicCreatePage(driver);

        loginPage.open();
        loginPage.doLogin(getPropertyValue("login"), getPropertyValue("password"));
        assertEquals(mainPage.findUserNavigationLabel().isDisplayed(), true);
        publicCreatePage.open();
        assertEquals(publicCreatePage.publicCreatPageAvailable(), true);
    }

}
