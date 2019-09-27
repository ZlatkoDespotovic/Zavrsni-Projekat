package rs.itbootcamp.humanity.page.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.utility.ExcelUtils;

public class HumanityAddNewEmployeeExcelTests {
	private static final String ADD_EMPLOYES_EXCEL_TEST_URL = "https://dim1.humanity.com/app/staff/list/load/true/";

	public static boolean AddEmployesExcelTest() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(HumanityHome.URL);
		HumanityLoginTests.logInAction(driver);
		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		HumanityStaff.clickAdd(driver);
		
		File src=new File("Data (5).xls"); 
		FileInputStream fis = new FileInputStream(src); 
		HSSFWorkbook wbe = new HSSFWorkbook(fis); 
		HSSFSheet sheet = wbe.getSheetAt(1); 
		int rownumber=sheet.getLastRowNum(); 
		for (int i = 1; i < rownumber; i++) {
			HSSFRow r=sheet.getRow(i);
			if(r!=null) {
				String firstName=r.getCell(0).getStringCellValue(); 
				String lastName=r.getCell(1).getStringCellValue(); 
				String email=r.getCell(2).getStringCellValue(); 
				HumanityStaff.inputFirstNameExcel(driver, firstName, i);
				HumanityStaff.inputLastNameExcel(driver, lastName, i);
				HumanityStaff.inputEmailExcel(driver, Math.random()+email, i);
				
			
			}
			
		}
		HumanityStaff.clickSaveEmployel(driver);
		Thread.sleep(5000);
		driver.quit();
		
		return true;
	
}
}