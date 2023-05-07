package techproed.utilies;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetry implements IRetryAnalyzer {


    /*
    Bu sınıf sadece FAIL olan test case'leri tekrar çalıştırır
    maxRetryCount ek olarak çalisma sayısıdır. Bu örnekte Fail olan test (maxRetryCount = 1) normal bir kere
    çalıştıktan sonra fail olursa 1 kez daha çalışacaktır.
     */
        private int retryCount = 0;
        private static final int maxRetryCount = 1;//fail olduktan sonra tekrar sayisi
        @Override
        public boolean retry(ITestResult result) {
            if (retryCount < maxRetryCount) {
                retryCount++;
                return true;
            }
            return false;
        }
}
