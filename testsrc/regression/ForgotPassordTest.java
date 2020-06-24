package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;
import util.BaseOpenBrowser;
import utilities.Driver;

import java.io.IOException;



public class ForgotPassordTest extends BaseOpenBrowser {

    Login login;

    @Test
    public void forgotPasswordTest() throws IOException {


        login = new Login(driver);
        login.clickLnkPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);

        forgotPassword.setTxtEmail("sanela@gmail.com");
        forgotPassword.clickBtnResetPassword();


    }


}
