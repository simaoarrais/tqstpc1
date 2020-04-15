package com.TQS.TPC1;// Generated by Selenium IDE
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class Selenium {

  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void submitdata() {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(550, 691));
    driver.findElement(By.name("location")).click();
    driver.findElement(By.name("location")).sendKeys("Lisboa");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.name("location")).click();
    driver.findElement(By.name("location")).sendKeys("London");
    driver.findElement(By.name("location")).sendKeys(Keys.ENTER);
  }
}
