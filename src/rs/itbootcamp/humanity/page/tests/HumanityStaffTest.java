package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySlika;

public class HumanityStaffTest {
	public static boolean TestPicture() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HumanityLoginTests.logInAction(driver);
		
		
        HumanityMenu.clickStaff(driver);
		
		HumanitySlika.clickEmployee(driver);
		HumanitySlika.clickDetails(driver);
		HumanityEditStaff.getUploadPicture(driver);
		HumanityEditStaff.dodajSliku(driver);
		
		
		return true;
     }
}



