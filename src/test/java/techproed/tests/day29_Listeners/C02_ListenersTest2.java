package techproed.tests.day29_Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

//Listeners eklemeden çalıştırdık, sadece fail durumunda tekrar çalıştırdı..
// Ama Listeners ekleyince class üzerine screenshot da yaptı ve resimleri çekerek klasör
// içerisinde verdi
@Listeners(techproed.utilies.Listeners.class)
public class C02_ListenersTest2 {
    @Test(retryAnalyzer = techproed.utilies.Listeners.class)//Eğer test fail olursa Listeners class'ındaki
    // retry methodu sayesinde 1 kez daha çalışır
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
        Driver.getDriver().findElement(By.xpath("//*[class='sdlkfsd']"));//yanlış locate aldık
    }
    @Test(retryAnalyzer = techproed.utilies.Listeners.class)
    public void test2() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
    }
    @Test(retryAnalyzer = techproed.utilies.Listeners.class)
    public void test3() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys("erol@gmail.com", Keys.TAB,"12345",Keys.ENTER);
    }
}
