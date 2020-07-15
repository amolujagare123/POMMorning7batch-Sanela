package util;


import org.testng.annotations.BeforeClass;
import pages.Login;

import java.io.IOException;

public class BaseDoLogin extends  BaseOpenBrowser{

    @BeforeClass
    public void doLogin() throws IOException {
        Login login = new Login(driver);
        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPaword("admin123");
        login.clickLoginButton();
    }
}
