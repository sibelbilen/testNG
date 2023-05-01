package techproed.tests.day26_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilies.DataProviderUtils;

public class C02_DataProviderTest2 {

    @Test(dataProvider = "sehirVerileri", dataProviderClass = DataProviderUtils.class)
    public void test01(String ad,String bolge,String plaka) {
        System.out.println("-Sehir ad->: "+ad+"-Bolge->"+bolge+"-plaka->"+plaka);


    }

    @Test(dataProvider = "kullaniciBilgileri",dataProviderClass = DataProviderUtils.class)
    public void test02(String username,String password) {

        System.out.println("kullanici ad : "+ " Sifre :  "+password);
    }
}
