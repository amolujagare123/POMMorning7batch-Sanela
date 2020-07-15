package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    @Test
    public void myTest() throws ParseException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.hotels.com/");
        driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-in']")).click();

       String setDateStr = "12/11/2020";

        Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);


        String currDateStr =
                driver.findElement(By.className("widget-datepicker-label")).getText();

        System.out.println(currDateStr);
        Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);


        int monthDiff =

                Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1),new DateTime(setDate).withDayOfMonth(1)).getMonths();

        boolean isFuture = true;

        if(monthDiff<0)
        {
            isFuture = false;
            monthDiff = monthDiff * (-1);
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int i=0; i<monthDiff ;i++)
        {

            if(isFuture)
               // js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[@class='widget-datepicker-next']")));
                driver.findElement(By.xpath("//div[@class='widget-daterange-cont']//div[2]//div[1]//button[2]")).click();
           /* else
                driver.findElement(By.xpath("//button[@class='widget-datepicker-prev']")).click();
*/
        }

        // FDS  | PSD
        String currDateDayStr = new SimpleDateFormat("dd").format(setDate);

        int currDateDayInt = Integer.parseInt(currDateDayStr);

        driver.findElement(By.xpath("//td/a[text()='"+currDateDayInt+"']")).click();




    }
}
