package net.mckinleyranch;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetChromeProfileTest {

	@Test
	public void test() {
	
		System.out.println("Opening Chrome in the default profile");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		//wait a few seconds to see the effect
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	
		System.out.println("Now opening Chrome in my profile");
		ChromeOptions options = new ChromeOptions();
		//find the path to your profile looking at "Profile Path" when you open chrome://version/
		options.addArguments("user-data-dir=C:/Users/Jason/AppData/Local/Google/Chrome/User Data");
		
		driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		
		//wait a few seconds to see the effect
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
