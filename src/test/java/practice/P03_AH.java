package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class P03_AH {
    public static void main(String[] args) {

        // 1-C01_TekrarTesti isimli bir class olusturun
        System.setProperty("webdriver.chrome.driver" , "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com");

        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//div[@role='none'][12]")).click();


        //4-Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedTitleIcerik = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Sayfa basliginin “Google” ifadesi iceriyor");
        } else {
            System.out.println("Sayfa basliginin “Google” ifadesi icermiyor");
        }

        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement googleAramaKutusu = driver.findElement(By.xpath("//input[@title='Suche'] "));
        googleAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //6-Bulunan sonuc sayisini yazdirin
        List<WebElement> sonucSayisiListesi = driver.findElements(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucSayisiListesi.get(0).getText());

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin


        /*
         if (sonucSayisiListesi > 10000000) {
            System.out.println("sonuc sayisinin 10 milyon’dan fazla");
        }else {
            System.out.println("sonuc sayisinin 10 milyon’dan fazla degil");
        }

         */


        //8-Sayfayi kapatin
        driver.close();
    }
}
