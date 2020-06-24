package pages.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy(xpath="//input[@id='client_name']")
    WebElement txtClientName;

    @FindBy (xpath="//input[@id='client_surname']")
    WebElement txtClientSurname;

    @FindBy (xpath="//input[@id='client_address_1']")
    WebElement txtStreetAddress;

    @FindBy (xpath="//input[@id='client_city']")
    WebElement txtCity;

    public  AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtClientName(String clientName)
    {
        txtClientName.sendKeys(clientName);
    }

    public void setTxtClientSurname(String surname)
    {
        txtClientSurname.sendKeys(surname);
    }

    public void setTxtStreetAddress(String address)
    {
        txtStreetAddress.sendKeys(address);
    }

    public void setTxtCity(String city)
    {
        txtCity.sendKeys(city);
    }


}
