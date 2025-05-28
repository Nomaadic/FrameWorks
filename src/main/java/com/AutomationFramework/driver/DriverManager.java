package com.AutomationFramework.driver;

import com.AutomationFramework.Utilis.PropertyReader;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager
{
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    // When we want browser to start
    public static void init()
    {
        String browser = PropertyReader.readKey("browser");

        switch (browser)
        {
            case "edge" :
                EdgeOptions ED = new EdgeOptions();
                ED.addArguments("--incognito");
                ED.addArguments("--maximized");
                driver = new EdgeDriver(ED);
                break;
            case "chrome" :
                ChromeOptions CD = new ChromeOptions();
                CD.addArguments("--incognito");
                CD.addArguments("--maximized");
                driver = new ChromeDriver(CD);
                break;
            case "firefox" :
                FirefoxOptions FD = new FirefoxOptions();
                FD.addArguments("--incognito");
                FD.addArguments("--maximized");
                driver = new FirefoxDriver(FD);
                break;
            default:
                System.out.println("Not Browser supported");
        }
    }
}

