package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import utilities.Driver;

import java.io.IOException;

import static utilities.Driver.getDriver;
import static utilities.MyProperties.getUrl;

public class BaseOpenBrowser {

    protected  WebDriver driver;

    @BeforeClass
    public void openUrl() throws IOException {
        driver = getDriver(Driver.DriverTypes.CHROME);
        driver.get(getUrl());
    }

}
