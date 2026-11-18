package com.pp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		
		WebDriver webdri= new ChromeDriver();
		webdri.manage().window().maximize();
		
		webdri.get("https://practice.expandtesting.com/iframe");
		
		webdri.switchTo().frame("email-subscribe");
		
		WebElement email=webdri.findElement(By.id("email"));
		email.sendKeys("ishwari@gmail.com");
	
		WebElement subscribeBtn = webdri.findElement(By.id("btn-subscribe"));
		((JavascriptExecutor) webdri).executeScript("arguments[0].click();", subscribeBtn);

		
	}

}