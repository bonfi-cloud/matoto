package zzzlaunch.zzzlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	        System.out.println("Je suis dans LaunchApplication");
	    }

	 
}
