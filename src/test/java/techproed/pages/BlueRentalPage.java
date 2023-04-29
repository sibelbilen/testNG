package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilies.Driver;

public class BlueRentalPage {
public BlueRentalPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement login;


    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;
}
