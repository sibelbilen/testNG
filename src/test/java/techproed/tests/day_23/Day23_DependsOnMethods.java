package techproed.tests.day_23;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Day23_DependsOnMethods {
    /*
    Test NG'de @Test metotları birbirinden bağımsız çalışır.
    Methodları bağımlı çalıştırmak istiyorsak "dependsOnMethods" parametresi kullanılır.
    Aşağıda seachTest() methodu homePageTest() methoduna bağlıdır.
    Eğer homePageTest() çalışırsa seachTest() de çalışır.
    Eğer homePageTest() fail olursa seachTest() çalışmaz, "ignore" edilir.
     */
    @Test

    public void HomePageTest() {
        assertEquals(1, 2);
        System.out.println("anasayfaya gidildi.");
    }

    @Test(dependsOnMethods = "HomePageTest")
    public void testseach() {
        System.out.println("arama yapildi");
    }

    @Test(dependsOnMethods ="HomePageTest")
    public void testsignInTest() {
        System.out.println("giris yapildi");
    }
}
