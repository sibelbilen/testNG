package techproed.tests.SmokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;
import techproed.utilies.ReusableMethods;

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
        public void test1() throws InterruptedException {
        /*
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        Acceptance Criteria
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error:
        User with email fake@bluerentalcars.com not found
         */
            Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
            BlueRentalPage blueRentalPage = new BlueRentalPage();
            blueRentalPage.login.click();
            blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"),
                    Keys.TAB,ConfigReader.getProperty("fakepass"));
            blueRentalPage.login2.click();
            ReusableMethods.bekle(3);
            Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());
            Driver.closeDriver();
        }
    }

