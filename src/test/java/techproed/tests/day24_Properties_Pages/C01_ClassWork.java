package techproed.tests.day24_Properties_Pages;

import org.testng.annotations.Test;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class C01_ClassWork {
    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
Driver.closeDriver();
Driver.getDriver().get(ConfigReader.getProperty("techproeducation_url"));



    }
}
