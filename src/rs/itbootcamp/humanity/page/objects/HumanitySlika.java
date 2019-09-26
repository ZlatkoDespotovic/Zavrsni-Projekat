package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanitySlika {
	private static final String EMPLOYEE_XPATH = "//a[contains(text(),'Dimitrije Budimirov')]";
	private static final String DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_XPATH = "//input[@id='fileupload']";

	// Emp Name
	public static WebElement getEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_XPATH));
	}

	public static void clickEmployee(WebDriver driver) {
		getEmployee(driver).click();
	}

	// Details
	public static WebElement getDetails(WebDriver driver) {
		return driver.findElement(By.xpath(DETAILS_XPATH));
	}

	public static void clickDetails(WebDriver driver) {
		getDetails(driver).click();
	}

	// Upload
	public static WebElement getUpload(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_XPATH));
	}

	public static void clickUpload(WebDriver driver) {
		getUpload(driver).click();
	}
}
