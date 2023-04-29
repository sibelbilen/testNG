package techproed.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilies.Driver;

public class OpenSourcePage {
 /*
Locate'lerimizi tek bir yerde duzenli bir sekilde tutabilmek icin;

1-   ilk olarak olusturmus oldugumuz page class'imizda bir constructor olustururuz.
2-PageFactory class'indan initelements methodu ile driver'i tanitiriz.
3-@findBy notasyonu kullanarak locatelerimizi aliriz.
    */

    @Test
    public void test01() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
