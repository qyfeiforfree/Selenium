package org.qiyanfei.SeleniumTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;

/**
 * Created by qyfei on 2016-2-15.
 */
public class SeleniumTestCase1 {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass
    public void setUp() throws Exception {
        //   System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.baidu.com/";
    }

    @Test
    public void testSearchCase() throws Exception {
        driver.get(baseUrl);
        Thread.sleep(1000);
        WebElement input = driver.findElement(By.id("kw"));
        input.sendKeys("Selenium");
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("su"));
        search.click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("Selenium"), "Title is incorrect.");
        System.out.println(driver.getTitle());
        //截图
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //保存
        FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
    }


    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}