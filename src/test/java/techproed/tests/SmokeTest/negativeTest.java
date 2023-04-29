package techproed.tests.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class negativeTest {
    /*
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        Acceptance Criteria
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error:
        User with email fake@bluerentalcars.com not found
         */

    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.login.click();


        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"),
                Keys.TAB,ConfigReader.getProperty("fakepass"),Keys.ENTER);

        Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());

    }
}
