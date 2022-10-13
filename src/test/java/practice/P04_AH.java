package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.Kernel;
import java.time.Duration;

public class P04_AH {
    public static void main(String[] args) {

        //1. “https://www.saucedemo.com” Adresine gidin

        System.setProperty("webdriver.chrome.driver" , "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin
        WebElement UsenameKutusu = driver.findElement(By.xpath("//input[@id='user-name']"));
        UsenameKutusu.sendKeys("standard_user" + Keys.ENTER);

        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement PasswordKutusu = driver.findElement(By.xpath("//input[@id='user-name'][2]"));
        PasswordKutusu.sendKeys("secret_sauce" + Keys.ENTER);

        //4. Login tusuna basin
        driver.findElement(By.xpath("//input[@id='login-button]")).click();


        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement SauceLabsBackpack = driver.findElement(By.xpath("//div[@class='inventory_item_name]"));
        SauceLabsBackpack.click();



        //6. Add to Cart butonuna basin


        //7. Alisveris sepetine tiklayin


        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin


        //9. Sayfayi kapatin

    }
}
