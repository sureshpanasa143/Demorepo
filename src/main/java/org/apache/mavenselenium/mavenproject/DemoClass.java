package org.apache.mavenselenium.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();	  
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.freecrm.com/");
	}

}
