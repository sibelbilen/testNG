package techproed.utilies;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {
    //Bu class ListenersRetry classı XML dosyasıyla test sınıflarıyla ilişkilendirilemediği için oluşturuldu.
    //Bu class ile ListenersRetry classını XML dosyası ile ilişkilendirebileceğiz.
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenersRetry.class);
    }
    }

