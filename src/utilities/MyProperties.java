package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class MyProperties {

    /*static ResourceBundle rb = ResourceBundle.getBundle("invoiceplane");

    public static String geturl()
    {
       return  rb.getString("url");
    }

    public  static  String getUserName()
    {
        return  rb.getString("user");
    }

    public  static  String getPassword()
    {
        return  rb.getString("pass");
    }*/


    static Properties getPropertiesObject() throws IOException {
        FileInputStream fp = new FileInputStream("Config\\invoiceplane.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return  prop;
    }


    public static String getUrl() throws IOException {
        return  getPropertiesObject().getProperty("url");
    }

    public static String getUserName() throws IOException {
        return  getPropertiesObject().getProperty("user");
    }

    public static String getPassword() throws IOException {
        return  getPropertiesObject().getProperty("pass");
    }


}
