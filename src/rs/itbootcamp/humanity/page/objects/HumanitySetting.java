package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySetting {
	public static final String SETINGS_XPATH = "//i[@class='primNavQtip__icon icon-gear']";
	public static final String COUNTRY_XPATH = "//select[@id='country']";
	public static final String DEFAULT_LANGUAGE_XPATH = "//td[@class='nowrap']//select[@name='language']";
	public static final String TIME_FORMAT_XPATH = "//select[@name='pref_24hr']";

	//klik na setings
	public static WebElement getSetings(WebDriver driver) {
	return driver.findElement(By.xpath(SETINGS_XPATH));
	}

	public static void clickSetings(WebDriver driver) {
	getSetings(driver).click();
	}
	//klik na padajuci meni country
	public static Select getCountry(WebDriver driver) {
	return new Select(driver.findElement(By.xpath(COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver, String data) {
	getCountry(driver).selectByVisibleText(data);
	}
	//klik na padajuci meni Default Language
	public static Select getDefaultLanguage(WebDriver driver) {
	return new Select(driver.findElement(By.xpath(DEFAULT_LANGUAGE_XPATH)));
	}

	public static void inputDefaultLanguage(WebDriver driver, String data) {
	getDefaultLanguage(driver).selectByVisibleText(data);
	}
	//klik na padajuci meni Time Format
	public static Select getTimeFormat(WebDriver driver) {
	return new Select(driver.findElement(By.xpath(TIME_FORMAT_XPATH)));
	}

	public static void inputTimeFormat(WebDriver driver, String data) {
	getTimeFormat(driver).selectByVisibleText(data);
}
}
