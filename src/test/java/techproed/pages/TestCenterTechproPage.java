package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilies.Driver;

public class TestCenterTechproPage {
    public TestCenterTechproPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='exampleInputEmail1']")
    public WebElement userName;



}
