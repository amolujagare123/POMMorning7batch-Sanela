package pages.clients;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class AddClient {

    public AddClient(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//input[@id='client_name']")
    private WebElement txtClientName;

   @FindBy(xpath="//input[@id='client_surname']")
    WebElement txtClientSurname;

   @FindBy(xpath="//input[@id='client_address_1']")
    WebElement txtStreetAddress;

   @FindBy(xpath="//input[@id='client_city']")
    WebElement txtCity;

   @FindBy(xpath = "//input[@id='client_state']")
   WebElement txtState;

   @FindBy(xpath="//input[@id='client_zip']")
   WebElement txtZipCode;

   @FindBy(xpath="//input[@id='client_phone']")
   WebElement txtPhone;

   @FindBy(xpath = "//input[@id='client_fax']")
   WebElement txtFax;

   @FindBy(xpath ="//input[@id='client_mobile']")
   WebElement txtMobile;

    @FindBy (xpath="//input[@id='client_email']")
    WebElement txtClientEmail;

    @FindBy(xpath="//input[@id='client_web']")
    WebElement txtWebAddress;

    @FindBy(xpath=" //input[@id='client_vat_id']")
    WebElement txtVatId;

    @FindBy(xpath="//input[@id='client_tax_code']")
    WebElement txtTaxesCode;

    @FindBy (xpath="//button[@id='btn-submit']")
    WebElement btnSave;

    @FindBy (xpath="//button[@id='btn-cancel']")
    WebElement btnCancel;

    @FindBy (xpath="//input[@id='client_birthdate']")
    WebElement txtBirthDate;

    @FindBy (xpath="//span[@id='select2-client_language-container']") // by id="select2-client_language-container
            WebElement containerLanguage;

    @FindBy(xpath="//span[@id='select2-client_country-container']") // by id="select2-client_country-container"
            WebElement containerCountry;

    @FindBy (xpath = " //span[@id='select2-client_gender-container']")
    WebElement containerGender;

    @FindBy(xpath="//input[@class='select2-search__field']")  // //input[@type='search']
            WebElement searchBox;

    @FindBy (xpath="//input[@id='client_active']")
    public WebElement checkActive;



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

    public void setClientEmail(String email)
    {
        txtClientEmail.sendKeys(email);
    }

    public void setClientState(String state)
    {
        txtState.sendKeys(state);
    }
    public void setClientZipCode(String zipCode)
    {
        txtZipCode.sendKeys(zipCode);
    }
    public void setClientsPhone(String phone)
    {
        txtPhone.sendKeys(phone);
    }
    public void setClientsFax(String fax)
    {
        txtFax.sendKeys(fax);
    }
    public void setClientsMobile(String mobile)
    {
        txtMobile.sendKeys(mobile);
    }
    public void setClientsWebAddress(String WebAddress)
    {
        txtWebAddress.sendKeys(WebAddress);
    }
    public void setClientVatId(String VatId)
    {
        txtVatId.sendKeys(VatId);
    }
    public void setTxtTaxesCode(String TaxesCode)
    {
        txtTaxesCode.sendKeys(TaxesCode);
    }
    public void clickSave()
    {
       btnSave.click();
    }
    public void clickCancel()
    {
        btnCancel.click();
    }


    public void setBirthDate(String setDateStr) throws ParseException {


       txtBirthDate.click();

        // convert String into Date ------>    PSD

       Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);

       String currDateStr
               =driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();

       System.out.print(currDateStr);

        // date in MMMM yyyy

// convert String into Date ------>    PSD

      Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);

      int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1),new DateTime(setDate).withDayOfMonth(1)).getMonths();

      boolean isFuture = true;
      if (monthDiff <0)
      {
          isFuture= false;
          monthDiff=monthDiff*(-1);
      }
      for (int i=0;i<monthDiff;i++)
      {
          if(isFuture)
              driver.findElement(By.className("next")).click();
          else
              driver.findElement(By.className("prev")).click();
      }

      String setDateday = new SimpleDateFormat("dd").format(setDate);
      int setDayDayInt= Integer.parseInt(setDateday);
      driver.findElement(By.xpath("//td[contains(text(),'"+setDayDayInt+"' ) and @class='day']")).click();



    }



   WebDriver driver;

   public void setLanguage(String language)
   {
       containerLanguage.click();
       searchBox.sendKeys(language);
       driver.findElement(By.xpath("//li[contains(text(),'"+language+"')]")).click();
   }

   public void setCountry (String country)
   {
       containerCountry.click();
       searchBox.sendKeys(country);
       driver.findElement(By.xpath("//li[text()='"+country+"']")).click();
   }

   public void selectGender (String gender)
   {
       containerGender.click();
       searchBox.sendKeys(gender);
       driver.findElement(By.xpath("//li[contains(text(),'"+gender+"')]")).click();
   }




}





  /* @FindBy(xpath="//span[@id='select2-client_language-container']") // @FindBy (name="client_language")
    WebElement drpLanguage;
   public void setLanguage(String language)
   {
       Select selLanguage = new Select(drpLanguage);
       selLanguage.selectByValue(language);
   }*/