package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SingletonWebDriver {
    private static SingletonWebDriver instance;
    private WebDriver wd;
    //constructor
    private SingletonWebDriver(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\usqyn\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        wd = new EdgeDriver();
    }
    public static SingletonWebDriver getInstance(){
        if(instance == null){
            synchronized (SingletonPattern.class) {
                if (instance == null){
                    instance = new SingletonWebDriver();
                }
            }
        }
        return instance;
    }

    public WebDriver getWebDriver() {
        return wd;
    }
}
