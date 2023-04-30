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

    @DataProvider
    public static Object[][] urunler() {
        return new Object[][]{{"Volvo"},{"Audi"},{"Honda"},{"Toyoto"},{"opel"},{"BMW"}};
    }
    @Test(dataProvider = "urunler")
    public void testdataprovider(String data){
     //Data providerdaki verileri alabilmek icin Test methodumuza String bir parametre atamasi yapariz.
        System.out.println(data);
    }
}
