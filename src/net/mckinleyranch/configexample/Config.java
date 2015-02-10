package net.mckinleyranch.configexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Config {
	
	//added this line
	WebDriver driver = null;
	
	public void openBrowser(String browser){
		
		System.out.println("In openBrowser.");
	
	
        try {
            if (browser.equals("Mozilla")) {
                driver = new FirefoxDriver();
            } else if(browser.equals("IE")){
                driver = new InternetExplorerDriver();
            } else if(browser.equals("Chrome")){
                System.setProperty("webdriver.chrome.driver", "\\Applications\\Google Chrome.app\\Contents\\MacOS\\Google Chrome ");
                driver = new ChromeDriver();
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }


    public void navigate(String baseUrl){
		System.out.println("In navigate.");

    	System.out.println("Driver = " + driver.toString());
        try {
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.navigate().to(baseUrl);
        } catch (Exception e) {

        }
    }


}
