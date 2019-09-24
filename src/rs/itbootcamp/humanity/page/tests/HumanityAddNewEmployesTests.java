package rs.itbootcamp.humanity.page.tests;

    import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import rs.itbootcamp.humanity.page.objects.HumanityHome;
	import rs.itbootcamp.humanity.page.objects.HumanityMenu;
	import rs.itbootcamp.humanity.page.objects.HumanityStaff;

	public class HumanityAddNewEmployesTests {
		public static boolean AddEmployeeTests() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get(HumanityHome.URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			HumanityHome.clickLogin(driver);
			HumanityHome.clickEmail(driver);
			HumanityHome.inputEmail(driver, "bixop@tympe.net");
			HumanityHome.clickPassword(driver);
			HumanityHome.inputPassword(driver, "dimitrije");
			HumanityHome.clickLoginLogin(driver);
			
			HumanityMenu.clickStaff(driver);
			
			HumanityStaff.clickAdd(driver);
			HumanityStaff.clickFirstName(driver);
			HumanityStaff.enterFirstName(driver, "Dragan");
			HumanityStaff.clickLastName(driver);
			HumanityStaff.enterLastName(driver, "Stevanovic");
			HumanityStaff.clickEmail(driver);
			HumanityStaff.enterEmail(driver, "dstevanovic@hotmail.com");
			HumanityStaff.clickSaveEmp(driver);
			HumanityStaff.clickCheck(driver);
			
			Thread.sleep(5000);
			driver.quit();
			
			return true;
			
			}
		}
	}
	
