package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https//:www.amazon.com");

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik="Amazon";

        String actualUrl=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Title testi FAILED");
            System.out.println("actual URL : " + actualUrl);
            System.out.println("Actual Url aranan" + expectedUrlIcerik + "kelimesini icermiyor");
        }


        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
            System.out.println("actual URL : " + actualTitle);
            System.out.println("Actual Url aranan" + expectedTitleIcerik + "kelimesini icermiyor");
        }


    }
}
