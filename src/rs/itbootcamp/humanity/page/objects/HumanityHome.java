package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "https://www.humanity.com/";
	private static final String FULL_NAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_FREE_TRAIL1_XPATH = "//input[@id='free-trial-link-01']";
	private static final String LOGIN_XPATH = "//i[@class='primNavQtip__icon icon-chart']";
	private static final String LOGIN_LOGIN_XPATH = "//button[contains(text(),'Log in')]";
	private static final String START_FREE_TRAIL_2_XPATH = "//a[@class='button pale']";
	private static final String ABOUT_US_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String EMAIL_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@id='password']";

// polje full name 
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_XPATH));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	public static void inputFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}

// polje work email
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_XPATH));
	}

	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();
	}

	public static void inputWorkEmail(WebDriver driver, String data) {
		getWorkEmail(driver).sendKeys(data);
	}

// dugme start free trail 1
	public static WebElement getStartFreeTrail1(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRAIL1_XPATH));
	}

	public static void clickStartFreeTrail1(WebDriver driver) {
		getStartFreeTrail1(driver).click();
	}

// dugme start free trail 2
	public static WebElement getStartFreeTrail2(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRAIL_2_XPATH));
	}

	public static void clickStartFreeTrail2(WebDriver driver) {
		getStartFreeTrail2(driver).click();
	}

// dugme about us
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

// dugme log in
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}
	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}
	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	public static WebElement getLoginLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_LOGIN_XPATH));
	}
	public static void clickLoginLogin(WebDriver driver) {
		getLoginLogin(driver).click();
	}

}
