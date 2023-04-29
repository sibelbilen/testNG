package techproed.tests.day24_Properties_Pages;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TestCenterTechproPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class C03_PageKullanimi {

    @Test
    public void test01() {
        ////https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));



        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterTechproPage testCenterTechproPage=new TestCenterTechproPage();
testCenterTechproPage.userName.sendKeys(ConfigReader.getProperty("kullaniciAdi"),Keys.TAB,ConfigReader.getProperty("kullaniciPassword"));
        testCenterTechproPage.logout.click();
        Assert.assertTrue(testCenterTechproPage.text.isDisplayed());

        //        //Sayfadan cikis yap ve cikis yapildigini test et
        testCenterTechproPage.logout.click();
        Assert.assertTrue(testCenterTechproPage.giris.isDisplayed());

Driver.closeDriver();
    }
}
