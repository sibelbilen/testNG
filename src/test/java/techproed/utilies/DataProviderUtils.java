package techproed.utilies;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
@DataProvider
    public Object[][]sehirVerileri(){

    return new Object[][]{{"Istanbul","Maramara","34"},
            {"Diyarbakir","Guneydogu","21"},{"Ankara","IcAnadolu","06"}};
}
    @DataProvider

    public  Object[][]kullaniciBilgileri(){
    return new  Object[][]{{"Ali","Ali.123"},{"Ayse","Ayse.123"},{"Fatma","Ftm_987"}};
    }

}

