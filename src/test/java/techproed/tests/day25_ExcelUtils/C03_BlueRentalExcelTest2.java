package techproed.tests.day25_ExcelUtils;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ConfigReader;
import techproed.utilies.Driver;
import techproed.utilies.ExcelUtils;
import techproed.utilies.ReusableMethods;

import java.io.FileNotFoundException;

public class C03_BlueRentalExcelTest2 {
    @Test
    public void test01() throws FileNotFoundException {
     /*
     EXCEL dosyamizdaki tum email ve passwordler ile
     BlueRentalCar sayfasina gidip login olalim?
      */

        ExcelUtils excelUtils=new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");

        //Sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        //Bir loop oluşturup excel dosyasındaki tüm verileri girdirelim
        for (int i = 1; i <= excelUtils.rowCount(); i++) {//i'yi 1 den başlattık çünkü veriler 1. satırdan başlıyor
            //baslik 0 oldugu icin 1 den basladik
            String mail = excelUtils.getCellData(i,0);
            String password = excelUtils.getCellData(i,1);
            System.out.println(mail+" || "+password);
            blueRentalPage.login.click();
            ReusableMethods.bekle(3);
            blueRentalPage.email.sendKeys(mail, Keys.TAB,password,Keys.ENTER);
            assert blueRentalPage.verify.isDisplayed();
            ReusableMethods.bekle(3);
            blueRentalPage.login3.click();
            ReusableMethods.bekle(3);
            blueRentalPage.logout.click();
            ReusableMethods.bekle(3);
            blueRentalPage.ok.click();
        }
        Driver.closeDriver();

    }
}
