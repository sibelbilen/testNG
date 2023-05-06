package techproed.tests.day29_Listeners;

import org.openqa.selenium.By;
import org.testng.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

@Listeners(techproed.utilies.Listeners.class)
public class C01_ListenersTest1   {


        @Test(retryAnalyzer = techproed.utilies.Listeners.class)
        public void test1() {
            System.out.println("PASSED");
            Assert.assertTrue(true);
            Assert.assertEquals(2,2);
        }
        @Test(retryAnalyzer = techproed.utilies.Listeners.class)
        public void test2() {
            System.out.println("FAILED");
            Assert.assertTrue(false);
        }
        @Test(retryAnalyzer = techproed.utilies.Listeners.class)
        public void test3() {
            System.out.println("SKIP");
            throw new SkipException("Method atlandı");//Testi atlar yani ignore eder
        }
        @Test(retryAnalyzer = techproed.utilies.Listeners.class)
        public void test4() {
            System.out.println("NO SUCH ELEMENT EXCEPTION");
            //throw new NoSuchElementException("NOSUCHELEMENTEXCEPTION");
            Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
            Driver.getDriver().findElement(By.xpath("lksdlfkjsldkjfs"));
        }
}
