package day01_driverMethods;

import org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import javax.naming.directory.BasicAttribute;

public class C01_firstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.close();

        driver.equals();


        driver.findElement(By.id(""));
        driver.findElement(By.linkText(""));
        driver.findElement(By.name(""));
        driver.findElement(By.className(""));
        driver.findElement(By.partialLinkText(""));
        driver.findElement(By.tagName(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.cssSelector(""));

        By ByAll = null;
        driver.findElement(ByAll);

        By BCDSTU4145PublicKey = null;
        driver.findElement(BCDSTU4145PublicKey);

        driver.findElement(By.id(""));
        driver.findElements(By.linkText(""));
        driver.findElements(By.name(""));
        driver.findElements(By.className(""));
        driver.findElements(By.partialLinkText(""));
        driver.findElements(By.tagName(""));
        driver.findElements(By.xpath(""));
        driver.findElements(By.cssSelector(""));

        driver.get(" ");
        driver.getClass();
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.getTitle();
        driver.getWindowHandle();
        driver.getWindowHandles();


        driver.hashCode();

        driver.manage();
        driver.manage().addCookie();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookie();
        driver.manage().deleteCookieNamed();
        driver.manage().equals();
        driver.manage().logs();
        driver.manage().notify();
        driver.manage().notifyAll();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().notify();
        driver.manage().window().setPosition("Set the position of the current window.");










        driver.findElements();



    }


    /*     1- selenium sitesinden sizin isletim sisteminize uygun selenium dosyalarini indirin,
              masaustune olusturacaginiz bir klasore, bu zip dosyasini acin

           2- selenium sitesinden, browsers sekmesinde bilgisayariniza uygun driver'i indirin, zip dosyasindan cikarip
              masaustune tasiyin

           3- selenium sitesinden indirdiginiz chrome surumu ile bilgisayardaki chromebrowser surumunun ayni
              oldugundan emin olun ayni degilse, bilgisayardaki chrome browser'i update edin

           4- yeni bir proje olusturun, proje olusturma asamasinda build-system olarak maven secin

           5- src altinda resources klasoru olusturun bu klasorun icine indirip, masaustune actigimiz selenium klasoru
              ve chromedriver dosyalarini tasiyin

           6- File/project structure menusunden modules ve dependencies'i secin + tusuna basip,
              projeye ekledigimiz selenium klasoru icindeki tum jar dosyalarini secip
              apply ve Ok tuslarina basin

           7-  src/main/java altinda bir class olusturun

           8- class'da main method olusturup yukaridaki kodlari yazin

             NOT : 8.satirdaki 2.parametre windows ve mac icin farklidir

     */


}
