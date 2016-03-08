package org.qiyanfei.SeleniumTest;
 import org.testng.annotations.*;

/**
 * Created by qyfei on 2016-3-8.
 */
public class Testngcase1 {

     @Test
     public void testTestNGcase1(){
         System.out.println("This is a TestNG cose1!");
     }
     @Test
     public void testTestNGcase2(){
         System.out.println("This is a TestNG cose2!");
     }
     @BeforeMethod
     public void testTestNGBeforeMethod(){
         System.out.println("This is a TestNG BeforeMothod!");
     }

     @AfterMethod
     public void afterMethod() {
         System.out.println("in afterMethod");
     }

     @BeforeClass
     public void beforeClass() {
         System.out.println("in beforeClass");
     }

     @AfterClass
     public void afterClass() {
         System.out.println("in afterClass");
     }

     @BeforeTest
     public void beforeTest() {
         System.out.println("in beforeTest");
     }

     @AfterTest
     public void afterTest() {
         System.out.println("in afterTest");
     }

     @BeforeSuite
     public void beforeSuite() {
         System.out.println("in beforeSuite");
     }

     @AfterSuite
     public void afterSuite() {
         System.out.println("in afterSuite");
     }
}
