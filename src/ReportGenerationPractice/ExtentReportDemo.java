package ReportGenerationPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static utilities.ForScreenshot.getScreenshot;

public class ExtentReportDemo {

    ExtentSparkReporter reporter;
    ExtentReports extent;

    @BeforeClass
    public void init()
    {
        reporter = new ExtentSparkReporter("Report\\report.html");
        reporter.config().setDocumentTitle("My test reports");
        reporter.config().setReportName("all the regression testis");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Project name","Billing system");
        extent.setSystemInfo("Programmer Name","sanela");
        extent.setSystemInfo("Tester name","Amol");

    }



    @Test
    public void mytest1() throws IOException {

        ExtentTest test = extent.createTest("myTest1") ;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        test.info("Browser is Maximized");

        driver.get("https://scriptinglogic.com");

        test.info("URL is opened");

        String expected = "https://scriptinglogic.com/";

        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "wrong url , or url is not opened");
            test.pass("Test is passed we are on the url:" + expected);
          //  test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }
        catch (AssertionError  e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }



    }

    @Test
    public void mytest2() throws IOException {

        ExtentTest test = extent.createTest("myTest2") ;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        test.info("Browser is Maximized");

        driver.get("https://facebook.com");

        test.info("Facebook is opened");

        String expected = "https://facebook.com";

        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "wrong url , or url is not opened");
            test.pass("Test is passed we are on the url:" + expected);
           // test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }



    }

    @AfterClass
    public void forReportWriting()
    {
        extent.flush();
    }
}
