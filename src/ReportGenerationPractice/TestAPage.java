package ReportGenerationPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAPage {

    @Test
    public void mytest() throws IOException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.com");


        // 1. crate an object reference of TakesScreenshot , assign driver to it
        // cast driver in (TakesScreenshot)
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs and create a file object
        // store that object into a File object variable
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        Date date = new Date();

        SimpleDateFormat sd = new SimpleDateFormat("_yyyy_MM_dd_hh_mm_ss");

        String dateStr = sd.format(date);

        String fileName = "Img"+dateStr+".png";




        // 3. copy that file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\sanela\\"+fileName));

    }


}
