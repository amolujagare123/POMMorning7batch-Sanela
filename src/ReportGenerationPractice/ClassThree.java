package ReportGenerationPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {





    @Test
    public void ClassThreeTest1()
    {

        System.out.println("ClassThreeTest1()");
    }

    @Test(groups = "email")//(enabled=false)
    public void ClassThreeTest2() // email validation
    {
        System.out.println("ClassThreeTest2()");
    }


    @Test
    public void ClassThreeTest3()
    {
        System.out.println("ClassThreeTest3()");
    }

}
