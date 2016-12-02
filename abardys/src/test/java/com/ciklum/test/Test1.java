package com.ciklum.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by anbar on 23-Nov-16.
 */
public class Test1 {

   /* @Test
    public void openGoogle() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "C:/Users/anbar/Desktop/training/git/training/abardys/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
       / driver.get("http://www.google.com");
       // Thread.sleep(5000);
        driver.close();

    }*/

    @Test
    public void openGoogle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua");
        driver.quit();
    }
}