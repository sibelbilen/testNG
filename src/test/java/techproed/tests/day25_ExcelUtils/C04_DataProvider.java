package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C04_DataProvider {

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

    /*
  Eğer farklı bir test methodu için aynı dataProvider methodu kullanılacaksa
  @DataProvider(name = "googleTest") şeklinde dataprovider notasyonundan sonra name paremetresine yeni olusturduğumuz
  methodun adını yazarız
   */
    @Test(dataProvider = "urunler")
    public void testdataprovider(String data) {//DataP.'daki verileri alabilmek için
        // Test methodumuza String bir parametre ataması yaparız
        System.out.println(data);
    }
    @DataProvider(name = "googleTest")
    public static Object[][] urunler() {
        return new Object[][]{{"Volvo"},{"Mercedes"},{"Audi"},{"Honda"},{"Toyota"},{"Opel"},{"BMW"}};
    }
    @Test
    public void googleTest(String araclar) {
        //Google sayfasına gidiniz

        //{"Volvo"},{"Mercedes"},{"Audi"},{"Honda"},{"Toyota"},{"Opel"},{"BMW"} araçları aratınız
        //Her aratmadan sonra sayfa resmi alınız
    }
}
