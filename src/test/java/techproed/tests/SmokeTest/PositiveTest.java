package techproed.tests.SmokeTest;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class PositiveTest {

    @Test
    public void testName() {
        /*
        Acceptance Criteria:
        Admin olarak, uygulamaya giriş yapabilmeliyim
        https://www.bluerentalcars.com/
        Admin email: jack@gmail.com
        Admin password: 12345
         */


        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.login.click();





    }
}
