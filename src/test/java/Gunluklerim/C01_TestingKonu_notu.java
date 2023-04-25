package Gunluklerim;

import org.testng.annotations.Test;

public class C01_TestingKonu_notu {

/*
1-@Test:test case olusturmakicin kullanilir.
2-
 */
@Test
public void test01() {
    System.out.println("Test 1");
}

    @Test
    public void test02() {
        System.out.println("Test 2");
    }

    @Test(groups = "regression test")
    public void test03() {
        System.out.println("Test 3");
    }

    @Test
    public void test04() {
        System.out.println("Test 4");
    }

    @Test(groups = "regression test")
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
