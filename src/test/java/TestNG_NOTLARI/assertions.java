package TestNG_NOTLARI;

public class assertions {

    /*
    --HER BIR TEST CASE ICIN ASSERTION VEYA VERIFICATION kullanmaliyiz.
    --testNG ile iki cesit Asertion yapmak mumkundur.
    --1.junitte kullandigimiz sekilde assert classindan method kullanarak yapmak.
    --2.junitte olmayan testng ye ozelolarak kullanabilecegimiz softAssert classindan methodlar kullnarak yapmak.


    1.HARD ASSERT

--JUnit’ten bildigimiz uzere en çok kullandığımız 3 cesit hard assertion turu vardir
                    i. Assert.assertEquals( )
                    ii. Assert.assertTrue( )
                    iii. Assert.assertFalse( )

--HARD assertion herhangi bir assertion failed olursa,test methodunun calismasini durdurur ve kalan kodlari yurutmez(stops execution).
--test casein nerede FAILED oldugunu hemen anlamak ve kod/a direk mudahele etmek istenirse hard assertion tercih edilebilir.


2. SOFT ASSERT (VERIFICATION)

--SoftAssert dogrulama(verification)olarak da bilinir.
--softAssert kullandigimizda,asser FAILED olsa bile test methodunun istedigimiz kismini durudurmaz yurutmeye devam eder. if else standetmentinde oldugu gibi
--eger assertionlar FAILED olursa raporlama yapilan satirdan sonrasini calistirmaz.
--soft assert classindaki methodlari kullanmak icin kullanabilmemiz icin object olusturmamiz gerekir.


 1.Adım: SoftAssert objesi olusturalim

SoftAssert softAssert = new
SoftAssert( );


• 2.Adım: Istedigimiz sayida
verification’lari yapalim

softAssert.assertTrue( );
softAssert.assertFalse( );


• 3.Adım: SoftAssert’in durumu raporlamasini
isteyelim
softAssert.assertAll();

     */

//Soft Assert vs Hard Assert

 /*
 --ORTAK OZELLIKLERI:

 1-   SoftAssert ve HardAssert method’ları TestNG’den gelmektedir.
Kullanma amaçları farklı olsa da method’lar aynıdır.


-- Farklari

1-hard assertion FAIL olursa test methodlarinin execute etmesini durur.ve fail olarak tanimlanir.
2-•Eğer softAssert FAIL olursa test method’ları execute etmeye devam eder. assertAll
dedigimizde FAILED olan assertion varsa execution durur.
  */



}
