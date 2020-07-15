package regression.Clients;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;
import util.BaseDoLogin;
import util.BaseOpenBrowser;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import static utilities.Driver.getDriver;
import static utilities.MyProperties.getUrl;

public class AddClientTest  extends BaseDoLogin {

        @Test(dataProvider = "getData")
        public void addClientTest (String name, String surname,String language, String add1, String
        city, String state, String zip, String country, String gender,String birthdate,String phone, String fax, String mobile, String email, String web,  String vat, String taxes, String expected, String xpathActual) throws ParseException
        {


            Menu menu = new Menu(driver);
            menu.clickAddClient();

            AddClient addClients = new AddClient(driver);

            addClients.setTxtClientName(name);
            addClients.setTxtClientSurname(surname);
            addClients.setTxtStreetAddress(add1);
           // addClients.setTxtStreetaddess2(add2);
            addClients.setLanguage(language);
            addClients.setTxtCity(city);
            addClients.setClientState(state);
            addClients.setClientZipCode(zip);
            addClients.setCountry(country);
            addClients.setClientsPhone(phone);
            addClients.setClientsFax(fax);
            addClients.setClientsFax(mobile);
            addClients.setClientEmail(email);
            addClients.setClientsWebAddress(web);
            addClients.selectGender(gender);
            addClients.setBirthDate(birthdate);
            addClients.setClientVatId(vat);
            addClients.setTxtTaxesCode(taxes);
            addClients.clickSave();



            String actual = "";
            try {
                actual = driver.findElement(By.xpath(xpathActual)).getText();
            } catch (Exception e) {
                actual = "";
            }
            Assert.assertEquals(actual, expected);

            // date selection : https://www.youtube.com/watch?v=yW1-IbI_soc

        }

        @DataProvider
        public Object[][] getData () throws IOException {
            FileInputStream fp = new FileInputStream("Data\\DataProv.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fp);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            int rowCount = sheet.getPhysicalNumberOfRows();


            Object[][] data = new Object[rowCount - 1][19];

            for (int i = 0; i < rowCount - 1; i++)
            {
                // XSSFRow row = sheet.getRow(i+1);

                for (int j = 0; j < 19; j++) {
                    // XSSFCell cell =  sheet.getRow(i+1).getCell(j);
                    data[i][j] = sheet.getRow(i + 1).getCell(j).toString().trim();
                }
            }

            return data;


        }

    }

