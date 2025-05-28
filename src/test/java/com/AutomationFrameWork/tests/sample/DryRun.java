package com.AutomationFrameWork.tests.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DryRun
{
    public WebDriver driver;
    @BeforeTest
    public void openBrowser()
    {
        EdgeOptions ED = new EdgeOptions();
        ED.addArguments("--incognito");
        ED.addArguments("--maximized");
        driver = new EdgeDriver(ED);
    }

    @Test

    public void test()
    {
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }

    @AfterTest

    public void closeBrowser() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }

}
