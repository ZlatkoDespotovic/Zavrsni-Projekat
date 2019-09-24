package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String HUMANITY_MANU_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	public static final String PROFILE_XPATH = "//a[contains(text(),'Profile')]";
	public static final String SETTINGS_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	public static final String AVAILABILITY_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	public static final String SING_OUT_XPATH ="//a[contains(text(),'Sign Out')]";
	public static final String APP_VERSION_XPATH ="//div[@id='humanityAppVersion']";
	// polje za profil humanity manu
		public static WebElement getHumanityManu(WebDriver driver) {
		return driver.findElement(By.xpath(HUMANITY_MANU_XPATH));
		}

		public static void clickHumanityManu(WebDriver driver) {
		getHumanityManu(driver).click();
		}

		// polje za profil 
		
		public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_XPATH));
		}

		public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
		}

		// polje za settings
		
		public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
		}

		public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
		}

		// polje za availability
		
		public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
		}

		public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
		
		}
		// polje za sing out
		
		public static WebElement getSingOut(WebDriver driver) {
		return driver.findElement(By.xpath(SING_OUT_XPATH));
		}

		public static void clickSingOut(WebDriver driver) {
		getSingOut(driver).click();
		}
		// polje za app version
		
		public static WebElement getAppVersion(WebDriver driver) {
		return driver.findElement(By.xpath(APP_VERSION_XPATH));
		}

}
