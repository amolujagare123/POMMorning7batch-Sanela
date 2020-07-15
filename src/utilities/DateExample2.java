package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateExample2 {

    @Test
    public void myTest() throws ParseException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.hotels.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement txtDestination = driver.findElement(By.name("q-destination"));

        String destination = "New Delhi, India";

        js.executeScript("arguments[0].setAttribute('value','"+destination+"');",txtDestination);


        WebElement txtdatePicker1 = driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-in']"));

        String setDateStr = "11/07/2020";


        js.executeScript("arguments[0].setAttribute('value','"+setDateStr+"');",txtdatePicker1);



        WebElement txtdatePicker2 = driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-out']"));

        String setDateStr2 = "13/07/2020";


        js.executeScript("arguments[0].setAttribute('value','"+setDateStr2+"');",txtdatePicker2);

        // for setting the destination text box
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       WebElement btnSearch = driver.findElement(By.name("q-destination"));
       // js.executeScript("arguments[0].click();",txtdatePicker2);
       btnSearch.click();





    }
}
