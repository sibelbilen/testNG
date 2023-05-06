package Odevler;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class C01_NegativeTest {
   /*

Acceptance Criteria:
Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
Hata Mesaji:
Bad credentials
Test Data:
Customer email: jack@gmail.com
Customer password: fakepass
    */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"),Keys.TAB,ConfigReader.getProperty("fakepass"),Keys.ENTER);

        blueRentalPage.login2.click();
       Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());



    }
}
