package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;
import techproed.utilies.ReusableMethods;

public class C04_DataProvider {
//-----------------------NOTE-01---------------------------------
    /*
   -- DataProvider , bir cok veriyi test caselere loop kullanmadan aktarmak icin kullanilir.
    TestNG'den gelen bir ozelliktir.
    --2 boyutlu bir object Array return eder.
   -- DDT(Data Driven Testing)icin kullanilir yani birden fazla veriyi test caselerde ayni anda
    kullanmak icin kullanilir.
    --kullanimi icin @Test notasyonundan sonra parametre olarak dataprovider yazilir
    ve string bir isim belirtilir.Bu belirttigimiz isimle @DataProvider notasyonu ile
    bir method olusturulur.
     */


  //-------------------NOTE-02------------------------------------


    /*
  Eğer farklı bir test methodu için aynı dataProvider methodu kullanılacaksa
  @DataProvider(name = "googleTest") şeklinde dataprovider notasyonundan sonra name paremetresine yeni olusturduğumuz
  methodun adını yazarız
   */
    @DataProvider(name = "googleTest")
    public static Object[][] urunler() {
        return new Object[][]{{"Volvo"}, {"Mercedes"}, {"Audi"}, {"Honda"}, {"Toyota"}, {"Opel"}, {"BMW"}};
    }

    @Test(dataProvider = "googleTest")
    public void testdataprovider(String data) {//DataP.'daki verileri alabilmek için
        // Test methodumuza String bir parametre ataması yaparız
        System.out.println(data);
    }

    @Test(dataProvider = "googleTest")
    public void googleTest(String araclar) {//
        //Google sayfasına gidiniz
        //Driver.getDriver().get("https://google.com");
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        //{"Volvo"},{"Mercedes"},{"Audi"},{"Honda"},{"Toyota"},{"Opel"},{"BMW"} araçları aratınız
        GooglePage googlePage = new GooglePage();
        googlePage.aramaKutusu.sendKeys(araclar, Keys.ENTER);
        //Her aratmadan sonra sayfa resmi alınız
        ReusableMethods.tumSayfaResmi();
        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }


    }

