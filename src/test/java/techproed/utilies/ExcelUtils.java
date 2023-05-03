package techproed.utilies;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    //privite neden yaptik -->sadece bu class icinde kullanabilmek icin
    private Workbook workbook;
    private Sheet sheet;
    private String path;
    //Constructor: Excel path'ine ve Excel'deki sayfaya ulaşmak için 2 parametreli cons. oluşturduk
    public ExcelUtils(String path,String sheetName){
        this.path = path;//bir path verilecekse bu classtaki path'i kullan
        try {
            FileInputStream fis = new FileInputStream(path);//dosya yolunu akisa aldik
            workbook = WorkbookFactory.create(fis);//excelde okumasi icin workbook objesine atama yaptik
            sheet = workbook.getSheet(sheetName);//path classindan sayfa ismi
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Satir ve sütun sayilari girildiğinde, o hücredeki veriyi return eder
    public String getCellData(int rowNum,int colNum){
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

    //============Exceldeki datalari 2 boyutlu array seklinde alir===
    public String[][] getDataArray() {
        String[][] data = new String[rowCount()-1][columnCount()];
        for (int i = 1; i < rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i, j);
                data[i-1][j] = value;
            }
        }
        return data;
    }

    //==============Sutun isimlerini verir==================//
    public List<String> getColumnsNames() {
        List<String> columns = new ArrayList<>();
        for (Cell cell : sheet.getRow(0)) {
            columns.add(cell.toString());
        }
        return columns;
    }
    //=========Deger, Satir, Sutun girindiginde, O satır ve sutuna girilen veriyi ekler===============//
    public void setCellData(String value, int rowNum, int colNum) {
        Cell cell;
        Row row;
        try {
            row = sheet.getRow(rowNum);
            cell = row.getCell(colNum);
            if (cell == null) {//if there is no value, create a cell.
                cell = row.createCell(colNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //    Bu metot ustdeki metotla birlikde calisir. Overload eder. Parametreleri farklidir
    public void setCellData(String value, String columnName, int row) {
        int column = getColumnsNames().indexOf(columnName);
        setCellData(value, row, column);
    }

    //    Exceldeki datalari basliksiz olarak 2 boyutlu array seklinde return eder

    //Baslıksız tum exceldeki verileri iki boyutlu arraye koyarak alir.
    public String[][] getDataArrayWithoutFirstRow() {
        String[][] data = new String[rowCount()][columnCount()];
        for (int i = 1; i <= rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i, j);
                data[i-1][j] = value;
            }
        }
        return data;
        }


}//class
