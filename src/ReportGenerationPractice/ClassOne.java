package ReportGenerationPractice;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Test
    public void ClassOneTest1()
    {
        System.out.println("ClassOneTest1()");

        String expected = "amol123";
        String actual = "amol12";


        Assert.assertEquals(actual,expected,"There is a difference in two names");



    }

    @Test
    public void ClassOneTest2() // email validation
    {
        System.out.println("ClassOneTest2()");


    }


    @Test
    public void ClassOneTest3( )
    {

        System.out.println("ClassOneTest3()");
    }

}
