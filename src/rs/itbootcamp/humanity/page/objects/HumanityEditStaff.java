package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String HUMANITY_MANU_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	public static final String PROFILE_XPATH = "//a[contains(text(),'Profile')]";
	public static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	public static final String UPLOAD_PICTURE_XPATH = "//input[@id='fileupload']";
	public static final String NICK_NAME_XPATH = "//input[@id='nick_name']";
	
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
	
	// polje za profil edit details
    public static WebElement getEditDetails(WebDriver driver) {
	return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

	public static void clickEditDetails(WebDriver driver) {
	getEditDetails(driver).click();
    }
	
	// polje za profil upload picture
	public static WebElement getUploadPicture(WebDriver driver) {
	return driver.findElement(By.xpath(UPLOAD_PICTURE_XPATH));
	}

	public static void clickUploadPicture(WebDriver driver) {
	getUploadPicture(driver).click();
	}
	// polje za profil nick name
	public static WebElement getNickName(WebDriver driver) {
	return driver.findElement(By.xpath(NICK_NAME_XPATH));
	}

	public static void clickNickName(WebDriver driver) {
	getNickName(driver).click();
	}
}
	
