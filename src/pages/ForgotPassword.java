package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

    @FindBy(xpath="//input[@id='email']")
    WebElement txtEmail;


    @FindBy (xpath="//button[@class='btn btn-danger']")
    WebElement btnResetPassword;


    public  ForgotPassword(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void clickBtnResetPassword()
    {
        btnResetPassword.click();
    }
}
