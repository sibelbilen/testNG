package techproed.utilies;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {
    Workbook workbook;
    Sheet sheet;
    String path;

    //Constructor:Excel path'ine ve exceldeki sayfaya ulasmak icin 2 parametreli constructor olusturduk
    public ExcelUtils(String path, String sheetName) throws FileNotFoundException {
        this.path = path;

        FileInputStream fis = new FileInputStream(path);
        try {
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//try
    }//excelUtils body

    //Satir ve sütun sayilari girildiğinde, o hücredeki veriyi return eder
    public String getCellData(int rowNum, int colNum) {
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        return cell.toString();
    }
    //Exceldeki satir sayisini return eder
    public int rowCount(){
        return  sheet.getLastRowNum();
    }
    //Exceldeki sütun sayisini return eder
    public int columnCount(){
        return sheet.getRow(0).getLastCellNum();
    }

}//class
