package net.mckinleyranch;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSValueCheckerTest {

	@Test
	public void verifyLinkColor() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yahoo.com");
		
		 String YAHOO_BLUE_LINK_COLOR = "rgba(50, 79, 225, 1)";

		 //get all the links on the page
		 List<WebElement> links = driver.findElements(By.tagName("a"));

		 for (WebElement currentLink: links){
			 
			 try{
				//get the cssValue "color" for each and see if it contains the color
				 assertTrue(currentLink.getCssValue("color").contains(YAHOO_BLUE_LINK_COLOR));
		         System.out.println("Link:" + currentLink.getText() + " IS blue.");
		        }catch(AssertionError e){
		        	System.out.println("Link:" + currentLink.getText() + " is NOT blue");
		        }
		    }
	}

}
