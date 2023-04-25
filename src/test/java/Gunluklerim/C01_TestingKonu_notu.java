package Gunluklerim;

import org.testng.annotations.*;

public class C01_TestingKonu_notu {

/*
1-@Test:test case olusturmakicin kullanilir.
2-@Before ve @after:5 before 5 after annotation bulunur.
suite >tests>group >class>method
3-@BeforeSuite: herbir test suitinden once bir kez  calisir.
4-@BeforeMethod:herbir test oncesi bir kez calisir
5-@BeforeTest:herbir test oncesi bir kez calsiir.(herbir test case oncesi degil)
5-@AfterSuite:



 */
    @AfterSuite
    public void AfterSuite(){
        System.out.println("herbir test suitinden sonra bir kez  calisir.");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest herbir test oncesi bir kez calisir.");
    }
@BeforeMethod
public void beforeMethod(){
    System.out.println("beforeMethod her testten once calisir");
    //7 tane varsa 7 kere calsiir.
}
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite hepsinden once calisir");
        //herbir testten once calisir ancak  7 tane test varsa sadece 1 kere calsiir 7 kere calismaz.

    }
@Test
public void test01() {
    System.out.println("Test 1");
}

    @Test
    public void test02() {
        System.out.println("Test 2");
    }

    @Test()
    public void test03() {
        System.out.println("Test 3");
    }

    @Test
    public void test04() {
        System.out.println("Test 4");
    }

    @Test()
    public void test05() {
        System.out.println("Test 5");
    }

    @Test
    public void test06() {
        System.out.println("Test 6");
    }

    @Test
    public void test07() {
        System.out.println("Test 7");
    }
}
