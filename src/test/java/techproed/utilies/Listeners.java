package techproed.utilies;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    //-------------------nOTE-----------------------

    /*
    LISTENERS; TestNG'de bir test'in durumunu ve sonucunu izleyen ve bu duruma yanit veren bir yapidir.
    Testlerin passed ve failed olma durumlarini baslangic ve bitiisni takip eder ve raporlayabilir.
    bunun icin testNg'den ITestlisteners arayuzunu(interface)kullaniriz.olusturdugumuz listerners
    class'ina ITlistener arauzundeki methodlari override etmek icin implements ederiz.

     */

    @Override
    public void onStart(ITestContext context) {//beforeClass gibi
        System.out.println(" onStart --> methodu tum testlerden once tek bir sefer cagirilir"+context.getName());//context.getName() :tum test calistigina testin ismini verir.
        //CONTEXT.GETNAME YAPIYORUZ CONTEXT PARAMETRE ISMI OLDUGU ICIN BU ISIM DEGISEBILIR.


    }


    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish --> tum testlerden sonra tek bir sfer cagrilir."+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {//beforecalss gibi
        System.out.println("onTestStart --> her bir testten once tek bir kere calisir."+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess --> PASSED olan testlerden sonra tek bir sefer cagrilir."+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure--> FAILED olan testlerden sonra tek bir sefer calisir"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped-->SKIP yapilan testlerden sonra tek bir sefer cagrilir."+result.getName());
    }
}
