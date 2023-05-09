package Odevler;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.HerokuPage;
import techproed.utilies.Driver;
import techproed.utilies.ReusableMethods;

public class Task_13 {

    /*
Negative Test
1.  https://id.heroku.com/login sayfasina gidin
2.  Faker class'ı kullanarak Dataprovider ile 5 adet email ve passwordleri giriniz
3.  Login butonuna tiklayiniz
4.  "There was a problem with your login." texti gorunur olduğunu test edin
5.  sayfalari kapatiniz
*/

    HerokuPage herokuPage=new HerokuPage();
    static Faker  faker=new Faker();

    @DataProvider
    public static Object[][] fakerClass() {

        return new Object[][]{  {faker.internet().emailAddress(), faker.internet().password()},
                {faker.internet().emailAddress(), faker.internet().password()},
                {faker.internet().emailAddress(), faker.internet().password()},
                {faker.internet().emailAddress(), faker.internet().password()},
                {faker.internet().emailAddress(), faker.internet().password()}};
    }

    @Test(dataProvider = "fakerClass")

    public void testNegative(String email,String password) {

//1.  https://id.heroku.com/login sayfasina gidin
        Driver.getDriver().get("https://id.heroku.com/login");
//2.  Faker class'ı kullanarak Dataprovider ile 5 adet email ve passwordleri giriniz
        ReusableMethods.bekle(3);
herokuPage.email.sendKeys(email+Keys.TAB);
herokuPage.password.sendKeys(password);
//3.  Login butonuna tiklayiniz
        herokuPage.buttonClick.click();
//4.  "There was a problem with your login." texti gorunur olduğunu test edin
      Assert.assertTrue(herokuPage.hataMesaji.isDisplayed());
//5.  sayfalari kapatiniz
        Driver.closeDriver();

    }
}
