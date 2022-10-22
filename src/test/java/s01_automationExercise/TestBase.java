package s01_automationExercise;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TestBase {

    /*
     * Java dilinde Annotation(Notasyonlar), bir veri hakkında bilgi barındıran veriyi sağlayan basit bir yapıdır.
     * Bu sağladığı bilgiye de “metadata” denir.
     * Notasyonlar( Annotation) genellikle Java’da konfigürasyon amacıyla kullanılır. Ya da bir bileşene ek özellikle katar.
     * Bu bileşenler sınıf, metod, değişkenler, paket ya da parametreler olabilir. Bunların hepsinde notasyonları kullanabiliriz.
     */

    public static WebDriver driver;

    /*

    @BeforeAll

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    @AfterAll

    public static void tearDown(){
        //driver.quit();



     */

}
