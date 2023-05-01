package techproed.tests.day26_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;
import techproed.utilies.ExcelUtils;
import techproed.utilies.ReusableMethods;

public class C01_DataProviderTest1 {

@DataProvider()
    public Object[][]customer(){

    //excelUtilis objesi olusturarak getDataArray()methodu ile iki boyutlu string array'i DataProvider olarak return yapariz.


    ExcelUtils excelUtils=
            new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customert_info");
  return   excelUtils.getDataArray();
}

////ikinci yol:
//@DataProvider()
//public Object[][]customer1(){
//
//    //excelUtilis objesi olusturarak getDataArray()methodu ile iki boyutlu string array'i DataProvider olarak return yapariz.
//String path="src/test/java/resources/mysmoketestdata.xlsx";
//String sheetName="customert_info";
//
//    ExcelUtils excelUtils=
//            new ExcelUtils(path,sheetName);
//    return   excelUtils.getDataArray();
//}


    @Test(dataProvider = "customerData")
    public void dataProviderExcelTest(String email, String password){
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(3);


    }
}
