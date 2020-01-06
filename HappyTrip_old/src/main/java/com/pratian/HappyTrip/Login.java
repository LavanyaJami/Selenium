package com.pratian.HappyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("os.name"));
		String url = "https://uatint-adjudication-kalos.mirrahealthcare.com/";

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement username= driver.findElement(By.id("userId"));
		username.sendKeys("lavanya@mirrahealthcare.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("password@123");
		WebElement submit= driver.findElement(By.id("btnSubmit"));
		submit.click();
		//driver.close();
		

	}

}
