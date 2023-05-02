package techproed.tests.day26_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilies.DataProviderUtils;

public class C02_DataProviderTest2 {

    //Burada data provider methodlarımızı DataProviderUtils classından alacağız:

    @Test(dataProvider = "sehirVerileri", dataProviderClass = DataProviderUtils.class)
    public void test1(String ad, String bolge, String plaka) {

        System.out.println("Sehir adı: " + ad + ", Bölge: " + bolge + ", Plaka: " + plaka);

    }

    @Test(dataProvider = "kullaniciBilgileri", dataProviderClass = DataProviderUtils.class)
    public void test2(String username, String password) {

        System.out.println("Kullanıcı adı: " + username + ", Şifre: " + password);

    }

    @Test(dataProvider = "customerData", dataProviderClass = DataProviderUtils.class, groups = "RegressionGroup1")
    public void test3(String username, String password) {

        System.out.println("Kullanıcı adı: " + username + ", Şifre: " + password);

    }

}
