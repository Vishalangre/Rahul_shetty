package Introduction;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invoke_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
	}

}
