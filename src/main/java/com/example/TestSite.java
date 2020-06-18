package com.example;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test;
public final class TestSite {
    private TestSite() {
    }

    public static void main(String[] args) {
        System.out.println("Hello!!!");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://192.168.56.102/content/about-us.php");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Page Source Output -> " + driver.getPageSource());
    
        if (driver.getPageSource().contains("About Us")) {
          System.out.println("Pass");
        } else {
          System.out.println("Fail");
        }
        driver.quit();
      }
    
    }
