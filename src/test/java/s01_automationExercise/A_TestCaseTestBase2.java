package s01_automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)



public class A_TestCaseTestBase2 {

    protected static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println(driver);
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

}
