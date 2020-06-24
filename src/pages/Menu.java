package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    @FindBy(xpath="//a[contains(text(),'Dashboard')]")
    WebElement lnkDashboard;

    @FindBy (xpath="//span[contains(text(),'Clients')]")
    WebElement lnkClients;

    @FindBy (xpath="//a[contains(text(),'Add Client')]")
    WebElement lnkAddClient;

    @FindBy (xpath="//a[contains(text(),'View Clients')]")
    WebElement lnkViewClient;

    @FindBy (xpath="//span[contains(text(),'Quotes')]")
    WebElement lnkQuotes;

    @FindBy (xpath="//a[contains(text(),'Create Quote')]")
    WebElement lnkCreateQuotes;

    @FindBy (xpath="//a[contains(text(),'View Quotes')]")
    WebElement lnkVieQuotes;

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


public void clickLnkDashboard()
{
    lnkDashboard.click();

}

 public void clickAddClient()
 {
     lnkClients.click();
     lnkAddClient.click();
 }

 public void clickViewClients()
 {
     lnkClients.click();
     lnkViewClient.click();
 }


}
