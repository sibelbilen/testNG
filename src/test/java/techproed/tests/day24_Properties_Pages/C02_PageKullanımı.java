package techproed.tests.day24_Properties_Pages;

import org.testng.annotations.Test;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class C02_PageKullanımı {

    @Test
    public void test01() {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim


        Driver.getDriver().get(ConfigReader.getProperty("openSource_Url"));
//        Yukardaki adres icin 20 adet test methodu olusturursak sonrasinda yukardaki url'de bir
//        degisiklik oldugunda butun test methodlarindan tek tek url duzeltmek yerine bir kere .properties
//        dosyamdan url'i duzeltirim ve bu bizim icin daha hizli daha duzenli ve daha kolay olur.


        //kullaniciAdi, kullaniciSifre, submitButton elementlerini bul





        //Login Testini basarili oldugunu test et
    }
}
