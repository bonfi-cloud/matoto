package zzzlaunch.zzzlaunch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;
	public BaseClass baseClass;
	public LoginPage loginPage;

	@Test
	public void testLogin() {
		baseClass = new BaseClass(); // Instanciation de BaseTest
		baseClass.setUp(); // Appel de la méthode setUp

		// Naviguer vers l'URL de connexion
		baseClass.navigateTo(); // Mettez à jour l'URL

		// Accéder au WebDriver depuis baseTest
		loginPage = new LoginPage(driver);

	}
}
