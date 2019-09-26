package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {

	private static final String LOGIN_TEST_URL = "https://dim1.humanity.com/app/dashboard/";

	public static boolean loginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(HumanityHome.URL);
		logInAction(driver); 

		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.equals(LOGIN_TEST_URL)) {
			System.out.println("Test prosao");
			driver.quit();
			return true;
		} else {
			System.out.println("Test nije prosao");
			driver.quit();

			return false;

		}

	}
	
	public static void logInAction(WebDriver driver) throws InterruptedException {
		HumanityHome.clickLogin(driver);
		Thread.sleep(3000);
		HumanityHome.clickEmail(driver);
		HumanityHome.inputEmail(driver, "bixop@tympe.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.inputPassword(driver, "dimitrije");
		HumanityHome.clickLoginLogin(driver);

	}
}