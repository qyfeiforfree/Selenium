package org.qiyanfei.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class SeleniumTest
{
    private  WebDriver driver;
    private String baseUrl;
    @BeforeClass
    public void setUp() throws Exception {
     //   System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

    }
    @Test
    public void testSearch() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.baidu.com/";
        driver.get(baseUrl);
        Thread.sleep(1000);
        WebElement input = driver.findElement(By.id("kw"));
        input.sendKeys("天气预报");
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("su"));
        search.click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().contains("天气预报"),"Title is incorrect.");
        System.out.println(driver.getTitle());
//      (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
//          public Boolean apply(WebDriver d){
//                 return d.getTitle().startsWith("天气预报");
//          }
//      });
    }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
