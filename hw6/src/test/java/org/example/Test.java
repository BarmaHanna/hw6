package org.example;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.net.URL;

public class Test {
    public static void main(String[] args)  {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        URL path = loader.getResource("chromedriver.exe");
        if (path != null) {
            System.setProperty("webdriver.chrome.driver", path.getPath());
        }
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("CatalogPage")); } }






