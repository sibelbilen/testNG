package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilies.Driver;

public class HerokuPage {
    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='email']")
        public WebElement email;

@FindBy(xpath = "//input[@id='password']")
    public WebElement password;
@FindBy(xpath = "//button[@name='commit']")
    public WebElement buttonClick;

@FindBy(xpath = "//div[text()='There was a problem with your login.']")
    public WebElement hataMesaji;
}
