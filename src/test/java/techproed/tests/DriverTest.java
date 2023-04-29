package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;

public class DriverTest {
    @Test
    public void driverTest1() {
        //Driver.getDriver().get("https://techproeducation.com");
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
        System.out.println(ConfigReader.getProperty("username"));
        System.out.println(ConfigReader.getProperty("password"));
    }
}
