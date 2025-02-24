package zzzlaunch.zzzlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver = null;



	public  void setUp() {
		System.out.println("les tests sont Ok");

		WebDriverManager.edgedriver().setup();
		// Initialisation du navigateur
		driver = new EdgeDriver();
		
		driver.get("https://ecommercepractice.letskodeit.com/login/");

		// Ouvrir la page de connexion

		driver.manage().window().maximize();
	}

	/*
	 * public void navigateTo() {
	 * driver.get("https://ecommercepractice.letskodeit.com/login/"); }
	 */

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
