package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\HPe WorkSpace\\Selenium Files\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.github.com");
		String BroswerTitle = driver.getTitle();
		System.out.println(BroswerTitle);
	}

}
