package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

  //  WebDriver driver;
   // By username = By.xpath("//input[@id='email']");

 /*   By username = By.xpath("//button[@name='submitAuth']");
    By password = By.xpath("//input[@placeholder='Pass']");
    By element =  By.xpath("//button[@name='submitAuth']");*/


    /*WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login']"));

    WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));

    WebElement btnLogin = driver.findElement(By.xpath("//button[@name='submitAuth']"));

*/
    // Using the page factory

    @FindBy (xpath="//input[@id='email']")
    public WebElement txtUsername;

    @FindBy (xpath="//input[@id='password']")
    public WebElement txtPaword;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy (xpath="//a[@class='btn btn-default']")
    public WebElement lnkForgotPassword;

    @FindBy (xpath="//label[@for='email']")
    public WebElement lblEmail;

    public void clickLnkPassword()
    {
        lnkForgotPassword.click();
    }


    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void setTxtUsername(String user)
    {
        txtUsername.sendKeys(user);
    }

    public void setTxtPaword(String pass)
    {
        txtPaword.sendKeys(pass);
    }

    public void clickLoginButton()
    {
        btnLogin.click();
    }


}
