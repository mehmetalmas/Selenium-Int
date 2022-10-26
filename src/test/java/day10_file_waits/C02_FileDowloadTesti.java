package day10_file_waits;


import org.junit.Test;
import org.openqa.selenium.By;
import s01_automationExercise.TestBase1;
import s01_automationExercise.TestBase2;

public class C02_FileDowloadTesti extends TestBase2 {
    /*
    1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
    2. https://the-internet.herokuapp.com/download adresine gidelim.
    3. code.txt dosyasını indirelim
    4. Dosyanın başarıyla indirilip indirilmediğini test edelim
     */

    @Test
    public void dowloadTesti(){
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. code.txt dosyasını indirelim
        driver.findElement(By.xpath("//*[text()='logo.png']")).click();
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim




    }

}
