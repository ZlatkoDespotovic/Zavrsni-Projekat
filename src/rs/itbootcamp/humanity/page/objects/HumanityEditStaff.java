package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL = "https://dim1.humanity.com/app/staff/list/load/true/";
	public static final String HUMANITY_MANU_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	public static final String PROFILE_XPATH = "//a[contains(text(),'Profile')]";
	public static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	public static final String UPLOAD_PICTURE_XPATH = "//input[@id='fileupload']";
	public static final String PICTURE_XPATH = "C:\\Users\\dell\\Desktop\\craniu-1024x1010.jpg";
	public static final String NICK_NAME_XPATH = "//input[@id='nick_name']";
	public static final String SAVE_EMPLOYEE_XPATH = "//button[@id='act_primary']";
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
	
	// polje za  edit details
    public static WebElement getEditDetails(WebDriver driver) {
	return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

    public static void clickEditDetails(WebDriver driver) {
    getEditDetails(driver).click();
    }
	
	// polje za upload picture
	public static WebElement getUploadPicture(WebDriver driver) {
	return driver.findElement(By.xpath(UPLOAD_PICTURE_XPATH));
	}

	public static void clickUploadPicture(WebDriver driver) {
	getUploadPicture(driver).click();
	}
	// dodavanje slike
	public static void dodajSliku(WebDriver driver) {
		 getUploadPicture(driver).sendKeys(PICTURE_XPATH);
	
	}
	// polje za  nick name
	public static WebElement getNickName(WebDriver driver) {
	return driver.findElement(By.xpath(NICK_NAME_XPATH));
	}
	public static void clickNickName(WebDriver driver) {
	getNickName(driver).click();
	}
	public static void inputNickName(WebDriver driver, String data) {
	getNickName(driver).sendKeys(data);
	}
    //	polje za save employee
	public static WebElement getSaveEmployee(WebDriver driver) {
	return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}
	public static void clickSaveEmployee(WebDriver driver) {
    getSaveEmployee(driver).click();
    }
	
}
	
