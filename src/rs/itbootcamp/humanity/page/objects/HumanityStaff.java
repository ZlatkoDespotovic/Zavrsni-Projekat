package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
    
	private static final String STAFF_XPATH ="//a[@id='sn_staff']";
	private static final String ADD_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_XPATH = "//input[@id='_asf1']";
	private static final String FIRST_NAME_EXCEL_1_XPATH = "//input[@id='_asf";
	private static final String LAST_NAME_XPATH = "//input[@id='_asl1']";
    private static final String LAST_NAME_EXCEL_1_XPATH = "//input[@id='_asl";
	private static final String EMAIL_XPATH = "//input[@id='_ase1']";
	private static final String EMAIL_EXCEL_1_XPATH = "//input[@id='_ase";
	private static final String EXCEL_2_XPATH = "']";
	private static final String SAVE_EMPLOYEL_XPATH = "//button[@id='_as_save_multiple']";
	private static final String CHECK_XPATH = "//a[@id='sn_staff']";
	
	//dugme za upisivanje zaposlenih
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}
	public static void clicStaff(WebDriver driver) {
		getStaff(driver).click();
	}
		
	// dodavanje zaposlenih
	public static WebElement getAdd(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_XPATH));
	}
	public static void clickAdd(WebDriver driver) {
		getAdd(driver).click();
	}

	// upisivanje imena
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void enterFirstName(WebDriver driver, String data) {
		getFirstName(driver).sendKeys(data);
	}
	// upisivanje imena zaposlenih iz excel tabele
	public static WebElement getFirstNameExcel(WebDriver driver, int i) {
			return driver.findElement(By.xpath(FIRST_NAME_EXCEL_1_XPATH + i + EXCEL_2_XPATH));
		}

	public static void clickFirstNameExcel(WebDriver driver, int i) {
			getFirstNameExcel(driver, i).click();
		}

		public static void inputFirstNameExcel(WebDriver driver, String data, int i) {
			getFirstNameExcel(driver, i).sendKeys(data);
		}
	// upisivanje prezimena
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void enterLastName(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}
	// upisivanje prezimena zaposlenih iz excel tabele
	public static WebElement getLastNameExcel(WebDriver driver, int i) {
		return driver.findElement(By.xpath(LAST_NAME_EXCEL_1_XPATH + i + EXCEL_2_XPATH));
	}

	public static void clickLastNameExcel(WebDriver driver, int i) {
		getLastNameExcel(driver, i).click();
	}

	public static void inputLastNameExcel(WebDriver driver, String data, int i) {
		getLastNameExcel(driver, i).sendKeys(data);
	}

	// upisivanje email-a
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void enterEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}
	
	// upisivanje email-a zaposlenih iz excel tabele
	public static WebElement getEmailExcel(WebDriver driver, int i) {
	return driver.findElement(By.xpath(EMAIL_EXCEL_1_XPATH + i + EXCEL_2_XPATH));
	}

	public static void clickEmailExcel(WebDriver driver, int i) {
	getEmailExcel(driver, i).click();
	}

	public static void inputEmailExcel(WebDriver driver, String data, int i) {
		getEmailExcel(driver, i).sendKeys(data);
	}

	// dugme save employees
	public static WebElement getSaveEmployel(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEL_XPATH));
	}

	public static void clickSaveEmployel(WebDriver driver) {
		getSaveEmployel(driver).click();
	}

	// dugme za proveru upisanih zaposlenih
	public static WebElement getCheck(WebDriver driver) {
		return driver.findElement(By.xpath(CHECK_XPATH));
	}

	public static void clickCheck(WebDriver driver) {
		getCheck(driver).click();
	}
}
