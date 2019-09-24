package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
public static final String URL = "https://dim1.humanity.com/app/dashboard/";
public static final String DASHBOARD_XPATH = "//a[@id='sn_dashboard']";
public static final String SHIFT_PLANNING_XPATH = "//a[@id='sn_schedule']";
public static final String CLOCK_XPATH = "//a[@id='sn_timeclock']";
public static final String LEAVE_XPATH = "//a[@id='sn_requests']";
public static final String TRAINING_XPATH = "//a[@id='sn_training']";
public static final String STAFF_XPATH = "//a[@id='sn_staff']";
public static final String PAYROLL_XPATH = "//a[@id='sn_payroll']";
public static final String REPORTS_XPATH = "//a[@id='sn_reports']";
public static final String SETINGS_XPATH = "//i[@class='primNavQtip__icon icon-gear']";

// klik na tablu
public static WebElement getDashboard(WebDriver driver) {
return driver.findElement(By.xpath(DASHBOARD_XPATH));
}

public static void clickDashboard(WebDriver driver) {
getDashboard(driver).click();
}

// klik na planiranje
public static WebElement getShiftPlanning(WebDriver driver) {
return driver.findElement(By.xpath(SHIFT_PLANNING_XPATH));
}

public static void clickShiftPlanning(WebDriver driver) {
getShiftPlanning(driver).click();
}

// klik na sat
public static WebElement getClock(WebDriver driver) {
return driver.findElement(By.xpath(CLOCK_XPATH));
}

public static void clickClock(WebDriver driver) {
getClock(driver).click();
}

// klik na dugme leave
public static WebElement getLeave(WebDriver driver) {
return driver.findElement(By.xpath(LEAVE_XPATH));
}

public static void clickLeave(WebDriver driver) {
getLeave(driver).click();
}

// klik na trening
public static WebElement getTraining(WebDriver driver) {
return driver.findElement(By.xpath(TRAINING_XPATH));
}

public static void clickTraining(WebDriver driver) {
getTraining(driver).click();
}

// klik na osoblje
public static WebElement getStaff(WebDriver driver) {
return driver.findElement(By.xpath(STAFF_XPATH));
}

public static void clickStaff(WebDriver driver) {
getStaff(driver).click();
}

// klik na platu
public static WebElement getPayroll(WebDriver driver) {
return driver.findElement(By.xpath(PAYROLL_XPATH));
}

public static void clickPayroll(WebDriver driver) {
getPayroll(driver).click();
}

// klik na izvestaje
public static WebElement getReports(WebDriver driver) {
return driver.findElement(By.xpath(REPORTS_XPATH));
}

public static void clickReports(WebDriver driver) {
getReports(driver).click();
}
//klik na setings
public static WebElement getSetings(WebDriver driver) {
return driver.findElement(By.xpath(SETINGS_XPATH));
}

public static void clickSetings(WebDriver driver) {
getSetings(driver).click();

  }
}







