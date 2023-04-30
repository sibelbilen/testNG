package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.Test;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;
import techproed.utilies.ExcelUtils;

import java.io.FileNotFoundException;

public class C03_BlueRentalExcelTest2 {
    @Test
    public void test01() throws FileNotFoundException {
     /*
     EXCEL dosyamizdaki tum email ve passwordler ile
     BlueRentalCar sayfasina gidip login olalim?
      */

        ExcelUtils excelUtils=new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        
       //sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        //bir loopolusturup excel dosyasindaki tum verileri girelim.
        for (int i = 1; i <=excelUtils.rowCount() ; i++) {//i'yi 1 den baslattik cunku veriler 1.satirdan basliyor.
        String email=excelUtils.getCellData(i,0) ;
String password=excelUtils.getCellData(i,1);
            System.out.println(email+">--->"+password);
        }
    }
}
