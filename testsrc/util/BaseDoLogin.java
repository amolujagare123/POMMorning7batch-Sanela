package util;


import org.testng.annotations.BeforeClass;
import pages.Login;

public class BaseDoLogin extends  BaseOpenBrowser{

    @BeforeClass
    public void doLogin()
    {
        Login login = new Login(driver);
        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPaword("admin123");
        login.clickLoginButton();
    }
}
