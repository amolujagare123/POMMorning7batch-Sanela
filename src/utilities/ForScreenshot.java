package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForScreenshot {


    public static String getScreenshot(WebDriver driver) throws IOException {

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
        FileUtils.copyFile(srcFile,new File("Report\\screenshots\\"+fileName));

        return  fileName;
    }


}
