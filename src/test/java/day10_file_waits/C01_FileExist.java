package day10_file_waits;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {

    @Test
    public void test01(){
        System.out.println(System.getProperty("user.dir")); //  C:\Users\Seyma\IdeaProjects\Selenium

        System.out.println(System.getProperty("user.home")); //  C:\Users\Seyma

        //"C:\Users\Seyma\Desktop\File testi\deneme.txt"
        //System.out.println(Files.exists(Paths.get("deneme.txt")));

        String dosyaYolu = System.getProperty(("user.home")) + "\\Desktop\\File testi\\deneme.txt";
        System.out.println(dosyaYolu);
        System.out.println(Files.exists(Paths.get(dosyaYolu))); // true




    }














}
