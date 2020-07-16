package uitesting;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.BaseOpenBrowser;

public class LoginTest extends BaseOpenBrowser {

    Login login;

    @BeforeClass
    public void myClass()
    {
        login = new Login(driver);
    }

    @Test
    public void checkTxtUsernameVisibility()
    {
        boolean expected = true;
        boolean actual =false;
        try {
             actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"username textbox is absent");
    }

    @Test
    public void checkTxtPasswordVisibility()
    {

        boolean expected = true;
        boolean actual =false;
        try {
            actual = login.txtPaword.isDisplayed();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"password textbox is absent");
    }


    @Test
    public void checkTxtUsernameEnability()
    {
        boolean expected = true;
        boolean actual =false;
        try {
            actual = login.txtUsername.isEnabled();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"username textbox is disabled");
    }


    @Test
    public void checkSpellingLblEmail()
    {
        String expected = "Email";

        String actual ="";
         try {
             actual = login.lblEmail.getText();
         }
         catch (Exception e)
         {

         }

        Assert.assertEquals(actual,expected,"incorrect spelling");

    }

    @Test
    public void checkWatermarkPasswordTextbox()
    {
        String expected ="Password";

        String actual="";

        try
        {
            actual = login.txtPaword.getAttribute("placeholder");
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"incorrect watermark or watermark is absent");
    }

    @Test
    public void checkBtnLofinColor()
    {
        String expected = "#2C8EDD";
        String actual="";

        try
        {
            String colrRgb = login.btnLogin.getCssValue("background-color");

            System.out.println("color in rgb:"+colrRgb);
                actual =  Color.fromString(colrRgb).asHex().toUpperCase();

               System.out.println("Converted color in hex:"+actual);
        }
        catch (Exception e)
        {
              e.printStackTrace();
        }

        Assert.assertEquals(actual,expected,"incorrect watermark or watermark is absent");

    }


}
