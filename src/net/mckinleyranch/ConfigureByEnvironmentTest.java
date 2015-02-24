package net.mckinleyranch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigureByEnvironmentTest {

	public static void main(String[] args) {

		/**
		 * Test to see if you can select the right Chromedriver based on environment
		 */
		
		String operatingSystem = System.getProperty("os.name");
		
		System.out.println("OS = " + operatingSystem);
		
		WebDriver driver=new ChromeDriver();
					
		driver.get("http://www.amazon.com");
		
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
