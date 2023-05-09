package Gunluklerim;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilies.ExcelUtils;

public class Excel {
    BlueRentalPage blueRentalPage=new BlueRentalPage();
    ExcelUtils excelUtils=new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
    @Test
    public void test01() {
        System.out.println(excelUtils.getCellData(2,1));
        String email=excelUtils.getCellData(1,0);
        String password=excelUtils.getCellData(3,0);
        System.out.println(email+password);
    }
}
