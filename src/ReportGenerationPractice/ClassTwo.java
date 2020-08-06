package ReportGenerationPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void ClassTwoTest1()
    {

        System.out.println("ClassTwoTest1()");
    }

    @Test
    public void ClassTwoTest2() // email validation
    {
        System.out.println("ClassTwoTest2()");
    }

    @Test
    public void ClassTwoTest3()
    {
        System.out.println("ClassTwoTest3()");
    }

}
