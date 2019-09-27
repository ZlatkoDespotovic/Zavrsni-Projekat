package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.utility.ExcelUtils;

public class HumanityLoginExcel {
		public static boolean Login() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			logInAction(driver);

			
			driver.quit();

			return true;
		}
		public static void logInAction(WebDriver driver) throws InterruptedException {
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			HumanityHome.clickLogin(driver);

			String srcFile = "C:\\Users\\dell\\Desktop\\zavrsni\\Data (4).xls";

			ExcelUtils.setExcell(srcFile);
			ExcelUtils.setWorkSheet(0);

			String email = ExcelUtils.getDataAt(0, 0);
			String pass = ExcelUtils.getDataAt(0, 1);

			HumanityHome.clickEmail(driver);
			HumanityHome.inputEmail(driver, email);
			HumanityHome.clickPassword(driver);
			HumanityHome.inputPassword(driver, pass);
			HumanityHome.clickLoginLogin(driver);

			Thread.sleep(10000);
			
			ExcelUtils.closeExcell();
			return;
			
		
	}
}


