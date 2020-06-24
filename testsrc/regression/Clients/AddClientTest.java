package regression.Clients;

import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;
import util.BaseDoLogin;

public class AddClientTest extends BaseDoLogin {


    @Test
    public void addClientTest()
    {

         Menu menu = new Menu(driver);
         menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setTxtClientName("amol");
        addClient.setTxtClientSurname("Ujagare");
        addClient.setTxtStreetAddress("katraj");
        addClient.setTxtCity("Pune");



    }
}
