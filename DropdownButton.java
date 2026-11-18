package com.pp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownButton {
	public static void main (String args[])
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/form-fields/");
		
		WebElement name=  driver.findElement(By.id("name-input"));
		name.sendKeys("Ishwari Sanjay Kshirsagar");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[2]/input"));
		password.sendKeys("Ishu@15082002");
		
		WebElement dropdownlist = driver.findElement(By.id("automation"));
		 
		Select slc = new Select(dropdownlist);
		
		slc.selectByIndex(3);
		
	}

}
