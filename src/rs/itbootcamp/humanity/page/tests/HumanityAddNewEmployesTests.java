package rs.itbootcamp.humanity.page.tests;

    import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
	import rs.itbootcamp.humanity.page.objects.HumanityMenu;
	import rs.itbootcamp.humanity.page.objects.HumanityStaff;

		public class HumanityAddNewEmployesTests {

			private static final String ADD_EMPLOYES_TEST_URL = "https://dim1.humanity.com/app/staff/list/load/true/";

			public static boolean AddEmployesTest() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				
				
				
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(HumanityHome.URL);
				HumanityLoginTests.logInAction(driver);
				HumanityMenu.clickStaff(driver);
				Thread.sleep(3000);
				HumanityStaff.clickAdd(driver);
				HumanityStaff.clickFirstName(driver);
				HumanityStaff.enterFirstName(driver, "Tasmanijski");
				HumanityStaff.clickLastName(driver);
				HumanityStaff.enterLastName(driver, "Djavo");
				HumanityStaff.clickEmail(driver);
				HumanityStaff.enterEmail(driver, "tasmanijskidjavo@gotmail.com");
				HumanityStaff.clickSaveEmp(driver);
				HumanityStaff.clickCheck(driver);
				
				Thread.sleep(5000);
				
				String url = driver.getCurrentUrl();
				System.out.println(url);

				if (url.equals(ADD_EMPLOYES_TEST_URL)) {
					System.out.println("Test prosao");
					driver.quit();
					return true;
				} else {
					System.out.println("Test nije prosao");
					driver.quit();

					return false;

				}

			}
		}
	
	
