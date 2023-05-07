package techproed.utilies;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Listeners implements ITestListener, IRetryAnalyzer {

    //-------------------nOTE-----------------------

    /*
    LISTENERS; TestNG'de bir test'in durumunu ve sonucunu izleyen ve bu duruma yanit veren bir yapidir.
    Testlerin passed ve failed olma durumlarini baslangic ve bitiisni takip eder ve raporlayabilir.
    bunun icin testNg'den ITestlisteners arayuzunu(interface)kullaniriz.olusturdugumuz listerners
    class'ina ITlistener arauzundeki methodlari override etmek icin implements ederiz.

     */

    @Override
    public void onStart(ITestContext context) {//@BeforeClass gibi
        System.out.println("onStart Methodu -> Tüm testlerden önce tek bir sefer çağrılır(classtan once) " + context.getName());
        //ITestContext context bu hangi classta icerigi demek
        //baslangic methodudur.
        //ITestContext overrid ediyor
        //java 8 den sonra interfacelere bodysi olan method koyabiliyoruz.interfacelere defualt method koyabiliriz.
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish Methodu -> Tüm testlerden sonra tek bir sefer çağrılır " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {//@Before gibi
        System.out.println("onTestStart Methodu -> Her bir test'ten önce tek bir sefer çağrılır " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Methodu -> PASSED olan testlerden sonra tek bir sefer çağrılır " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Methodu -> FAILED olan testlerden sonra tek bir sefer çağrılır " + result.getName());
        ReusableMethods.tumSayfaResmi(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Methodu -> SKIP(atlanan) olan testlerden sonra tek bir sefer çağrılır " + result.getName());
    }

    private int retryCount = 0;
    private static final int maxRetryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    /*
    Bu method sadece FAIL olan test case'leri tekrar çalıştırır
    maxRetryCount ek olarak çalisma sayısıdır. Bu örnekte Fail olan test (maxRetryCount = 1) normal bir kere
    çalıştıktan sonra fail olursa 1 kez daha çalışacaktır.
     */

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        /*
            Bu methodun amacı; test notasyonlarını, sınıfları, cons.ları ve methodları transform(dönüştürme) etmemize
        olanak sağlar
            Bu method sayesinde Listeners sınıfını .xml dosyasında kullanabileceğiz ve istediğimiz class'ları fail
        olma durumunda listeners sınıfı retry methodunu kullanarak istediğimiz kadar tekrar çalıştırabileceğiz.
         */
        annotation.setRetryAnalyzer(Listeners.class);
    }
}