package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver driver; 
    String myUsername = "vukcevicmarko7@gmail.com";
    String Mypassword = "Codeacademy";

@Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\vukcevic\\Desktop\\FinalExam\\FinalExam-main\\TestExamProject\\TestExamProject\\lib\\geckodriver.exe");
        //FirefoxOptions options = new FirefoxOptions();
        //options.setHeadless(true);
        //driver = new FirefoxDriver(options);
        
        driver = new FirefoxDriver();

        //driver.manage().window().maximize();
    }
@After
    public void teardown() {
        driver.quit(); 
    }
}
 