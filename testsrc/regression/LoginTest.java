package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;
import util.BaseOpenBrowser;
import utilities.Driver;

import java.io.IOException;

import static utilities.Driver.getDriver;
import static utilities.MyProperties.getUrl;

public class LoginTest extends BaseOpenBrowser {


    @Test
    public void loginTest() throws IOException {


        Login login = new Login(driver);

        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPaword("admin123");
        login.clickLoginButton();


    }

}
