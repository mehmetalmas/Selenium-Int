package day08_iframe_windows;

import org.junit.Test;

public class C06_TestBaseIlkTest extends C05_TestBase {

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test02(){
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test03(){
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
    }




}
