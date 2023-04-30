package Gunluklerim;

public class SQL_NOTLARI {
         /*
        SQL = Structured Query Language (Yapilandirilmis Sorgu Dili)
        Sorgu dili denmesinin sebebi Database'deki verileri sorgulayacak olmamizdir.
        SQL, Database'deki verileri sorgulamanin yanisira guncelleme, silme ve yeni veri eklemek icin de kullanilir
        *Database birbiri ile iliskili verilerin bir arada bulundugu yerdir.
        -Mesela yapilacaklar listesi(kagit) , insan beyni, telefon rehberi, harddisk, bulut sistemi...
        -Bunlari hepsi database'e ornek gosterilebilir.
        -Buyuk sirketler (Orn; Facebook) verilerini bulutta saklar.
        -Bulut sistemi hafizasi yuksek olan bilgisayarlarda bibiri ile iliskili verilerin depolanmasidir.
        -Birbiri ile alakali olmayan verilerin bir arada olmasinin bir anlami yoktur.
        Dijital Databese Avantajlari:
        1-Yuksek miktarda bilgi depolanabilir.
        2-Giris kolaydir.
        3-Create(Olusturma), Read(Okuma), Update (Degistirme) ve Delete(Silme) kolayligi saglar. (CRUD)
        4-Guvenlidir.(Sifre ile erisim saglanir)(Dijital olmayanlar guvenli degildir)
        5-Dataya ulasim kolaydir
        SQL ile database de veri olusturup yine SQL ile database'de olusturulan verileri sorgulama yapabiliriz.
        Selenium ve API ile de ayni islemleri yapabiliriz.Bu ucu ile (SQL,API,Selenium) test etme yontemini bilirsek Full Stack Automation Tester denilir.
                END To END (E2E) Testing
        1-Database'de veriyi SQL ile olusturduysak SQL,Selenium,API ile test edebiliriz.
        2-Database'de veriyi Selenium ile olusturduysak SQL,Selenium,API ile test edebiliriz.
        1-Database'de veriyi API ile olusturduysak SQL,Selenium,API ile test edebiliriz.
        ***Bunun icin ucunu de bilmek gerekir.Bu isi de sadece Full Stack Automation Engineer yapabilir.
                Database Management System(DBMS)(Database Yonetim Sistemi)
        *Database'e yetkisi olan personelin erisimini saglar.
        *Data guvenligini saglar.
        *CRUD islemlerini duzenler.
                TABLOLAR(TABLES)
        -->SQL Database'de butun veriler TABLO'larda saklanir.
        -->Tablolarda satirlar(row veya record) ve sutunlar(column veya field) vardir.
        !!!Sutun basliklari (isimleri) veri degildir.
                ILISKILI TABLOLAR (Relational Databases)
        -Tablolarin ve iliskilerin butunune schema denir.
        -Tablolar arasi; iliskiler net ve gecis kolay olmalidir.
                En Cok Kullanilan DBMS'ler
        -PostgreSQL: Yeni nesil olarak ortaya cikmis ve zor gorevler icin idealdir.
        -MySQL:Eszamanli islem girildiginde calismayi durdurabilir lakin acik kaynaklidir, online destek ve ucretsiz dokuman fazladir.
        Aralarinda cok fazla fark yoktur.
        --Oracle SQL: Karmasiktir fakat yuksek guvenlikli ve OOP'ye uyumludur.
        --Microsoft SQL:Pahalidir fakat zengin bir user interface'e (kullanici arayuzu) sahiptir ve buyuk datalarin kullanilmasinda sorunsuz calisir
                SQL KOMUTLARI
         SQL komutlari gruplara ayrilir:
                1-Data Definition Language(Tanimlama)(Bu komutlar tablo ile ilgilenir)
         CREATE ==> Tablo olusturur.(Bu komutla sutun isimleri verilir)
         ALTER ==> Tabloyu gunceller.(Tablonun veya sutun isimlerini guncellemeye yarar)
         DROP ==> Tabloyu siler.
                2-Data Manipulation Language(Isleme)(Bu komutlar verilerle ilgilenir)
         INSERT ==> Tabloya veri ekler.
         UPDATE ==> Tablodaki verileri gunceller.
         DELETE ==> Tablodaki verileri siler.
            3-Data Query Language(Bu komutlar tablonun icindeki verilerle ilgilenir)
        SELECT  ==> Tablodaki verileri listeler. (Sorgulama yapmak icin kullanilir)
            4-Data Control Language(Veri Kontrol Dili)(Bu komutlari genellikle developerlar kullanir)
            GRANT : Bir kullanıcıya yetki vermek için kullanılır.
            REVOKE : Bir kullanıcıya verilen yetkiyi geri almak için kullanılır.
         SQL DATA TURLERI
         Eger olusturacagimiz database'e String veriler gireceksek String Data Turleri kullanmaliyiz.
         String Data Turleri:
         *char(size)  ==> Uzunlugu belli olan String Datalar icin "char(size)" data turu kullanilir.T.C numarasi , Telefon numarasi vs gibi
         "size" dan az karakter girebiliriz ama fazla karakter giremeyiz. Hafizada "size" degeri kadar byte yer kaplar.
         *varchar(size)  ==> Uzunlugu belli olmayan String Datalar icin "varchar(size)" data turu kullanilir.Isim,Soyisim,Adres gibi..
         "size" dan az karakter girebiliriz ama fazla karakter giremeyiz.Hafizada kullanilan karakter kadar byte yer kaplar.
         ->Burda tahmini max size yazmakta fayda var!
         Numeric Data Turleri:
         *int   ==> Tamsayilar icin kullanilir
         *real  ==> Ondalikli sayilar icin kullanilir
         Date Data Turu:
         *date ==> tablodaki sutunlara tarih depolamak icin kullanilir
         YYYY-MM=DD ==> standart bu sekildedir
         CONSTRAINT (Kisitlamalar)
         *Her sutuna vermek zorunda degiliz, istedigimiz kisimlara verebiliriz.
         *UNIQUE: Bir sutundaki tum verilerin BENZERSIZ olmasi gerekir.Bu komut olunca mukerrer veri giremeyiz.
         *NOT NULL:Bir sutundaki tum verilerin NULL ICERMEMESIDIR.Gereklilik halinde kullanilir
         -->NOT NULL kisitlamasi icin constraint ismi tanimlanmaz ve data turunden hemen sonra yazilir.
         *PRIMARY KEY:Bir sutundaki tum verilerin BENZERSIZ ve NOT NULL olmasidir.(UNIQUE+NOT NULL)
         *CHECK:Bir sutuna yerlestirilebilecek deger araligini sinirlamak icin kullanilir.
         *FOREIGN KEY: Baska bir tablodaki Primary Key'i referans gostermek icin kullanilir. Boylece tablolar arasi iliski kurulmus olur.
         NOTE: Bir tabloda en fazla bir PRIMARY KEY kullanilabilir
         ***Bir veriyi kullanarak sadece bir kisiye ulasmak isteniyorsa o zaman Primary Key kullanilir.
         SQL Composite Key
         Tek basina bir sutun Primary Key olma ozelligi tasimiyorsa, bu ozelligi elde etmek icin iki sutun  birlestirilerek bir Primary Key olusturulabilir.
         Bu duruma Composite Key denir.
         “UNIQUE KEY” ve “PRIMARY KEY” arasindaki farklar
            Primary Key                                         Unique Key
        Bir Tabloda 1 tane olur                           Bir tabloda birden fazla olabilir
        NULL deger Kabul etmez                            NULL degeri Kabul eder
        ***“UNIQUE KEY” ve “PRIMARY KEY” ortak ozellikleri
        Dublication(Cift Kullanim)’a izin verme
        Foreign Key iki tablo arasinda Relation olusturmak icin kullanilir.
         Foreign Key baska bir tablonun Primary Key’ine baglidir.
         Referenced table (baglanilan tablo, Primary Key’in oldugu Tablo) parent table olarak
         adlandirilir. Foreign Key’in oldugu tablo ise child table olarak adlandirilir.
         Bir Tabloda birden fazla Foreign Key olabilir
         Foreign Key NULL degeri alabilir
            Note 1: “Parent Table” olmayan bir id’ye sahip datayi “Child Table”’a ekleyemezsiniz
            Note 2: Child Table’i silmeden Parent Table’i silemezsiniz. Once “Child Table” silinir, sonra
            “Parent Table” silinir
         */
}
