package TestNG_NOTLARI;

public class NOT_05_dependsOnMethods {

    /*
    --dependsOnMethods BU YONTEM,bir methodun diger bir methoda bagli olmasini saglamak icin kullanilir.
    --bir ornekte, homePage metdod’u searchTest
method’una bağlıdır. Yani, homePage başarılı
olursa searchTest de çalisacaktir.
➢ Diger durumda yani, homePage başarısız olursa
searchTest ignore edilecek, hic çalismayacaktir.
➢ Yalnızca searchTest method’unu çalıştırırsak bile, TestNG önce homePage metodunu
çalıştırır. homePage başarılı olursa searchTest calistirilir
➢ Ustteki madde sadece 2 method icin gecerlidir. 3 method’u birbirine baglayip 3.method’u
calistirirsaniz, 1.method’a kadar gitmez.

     */
}
