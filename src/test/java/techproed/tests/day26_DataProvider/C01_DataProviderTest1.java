package techproed.tests.day26_DataProvider;

import org.testng.annotations.DataProvider;
import techproed.utilies.ExcelUtils;

public class C01_DataProviderTest1 {

@DataProvider()
    public Object[][]customer(){

    //excelUtilis objesi olusturarak getDataArray()methodu ile iki boyutlu string array'i DataProvider olarak return yapariz.


    ExcelUtils excelUtils=
            new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customert_info");
  return   excelUtils.getDataArray();
}

//ikinci yol:
@DataProvider()
public Object[][]customer1(){

    //excelUtilis objesi olusturarak getDataArray()methodu ile iki boyutlu string array'i DataProvider olarak return yapariz.
String path="src/test/java/resources/mysmoketestdata.xlsx";
String sheetName="customert_info";

    ExcelUtils excelUtils=
            new ExcelUtils(path,sheetName);
    return   excelUtils.getDataArray();
}

}
