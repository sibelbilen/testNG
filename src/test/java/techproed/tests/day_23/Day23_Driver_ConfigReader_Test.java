package techproed.tests.day_23;

import org.testng.annotations.Test;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class Day23_Driver_ConfigReader_Test {
    @Test
    public void driverTest(){

        //https://techproeducation.com/ sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("techproeducation_url"));

        //Title testi yapınız
        assertTrue(Driver.getDriver().getTitle().contains("Techpro"));

        //sayfayı kapatınız.
        Driver.closeDriver();

    }
}
