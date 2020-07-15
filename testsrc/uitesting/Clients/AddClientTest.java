package uitesting.Clients;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;
import util.BaseDoLogin;

public class AddClientTest extends BaseDoLogin {

    AddClient addClient = new AddClient(driver);

    @BeforeClass
    public void getMenu()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();
    }


    @Test
    public void checkCheckboxActiveSelection()
    {
        boolean expeted = true;
        boolean actual = false;
        try {
            addClient.checkActive.click();
            actual = addClient.checkActive.isSelected();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expeted,"checkbox is not selected");
    }



}
