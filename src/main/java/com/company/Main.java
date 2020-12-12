package com.company;

import org.jetbrains.annotations.TestOnly;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Main {

  @Test
          public void sendEmail() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
       driver.get("https://mail.ru/");

      driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/div[1]/div[2]/input")).sendKeys("");//put your email
      driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/div[2]/input")).sendKeys("");//put your password
      driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[2]")).click();
  driver.wait(500);
      driver.findElementByXPath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/span/div[1]/div/div/div/div/div[1]/div/div/div/div/span/span/span/svg").click();



    }
}
