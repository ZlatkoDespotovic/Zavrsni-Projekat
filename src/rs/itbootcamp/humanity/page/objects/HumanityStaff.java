package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	private static final String ADD_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_XPATH = "//input[@id='_asf1']";
	private static final String LAST_NAME_XPATH = "//input[@id='_asl1']";
	private static final String EMAIL_XPATH = "//input[@id='_ase1']";
	private static final String SAVE_EMPLOYEL_XPATH = "//button[@id='_as_save_multiple']";
	private static final String CHECK_XPATH = "//a[@id='sn_staff']";

	//upisivanje zaposlenih
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

	// dugme save employees
	public static WebElement getSaveEmployel(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEL_XPATH));
	}

	public static void clickSaveEmp(WebDriver driver) {
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
