package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        // create WebElement (FE) + Perform Actions(click, sendKeys, getText, isDisplayed)
        // 1
//        driver.findElement(By.id("input-email")).sendKeys("akshay@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("akshay@123");

        // 2
//        WebElement emailId = driver.findElement(By.id("input-email"));
//        WebElement password = driver.findElement(By.id("input-password"));
//
//        emailId.sendKeys("akshay@gmail.com");
//        password.sendKeys("akshay@123");

        // 3 By locator
//        By emailID = By.id("input-email");
//        By password = By.id("input-password");
//
//        WebElement elementEmail = driver.findElement(emailID);
//        WebElement elementPassword = driver.findElement(password);
//
//        elementEmail.sendKeys("akshay@gmail.com");
//        elementPassword.sendKeys("akshay@123");

        // 4 By locator + generic methods for WebElement
//        By emailID = By.id("input-email");
//        By password = By.id("input-password");
//
//        getElement(emailID).sendKeys("akshay@gmail.com");
//        getElement(password).sendKeys("akshay@123");

        // 5 By locator + generic methods for WebElement and actions
//        By emailID = By.id("input-email");
//        By password = By.id("input-password");
//
//        doSendKeys(emailID, "akshay@gmail.com");
//        doSendKeys(password, "akshay@123");

        // 6 By locator + generic methods for WebElement and actions with element util class
        By emailID = By.id("input-email");
        By password = By.id("input-password");

        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSendKeys(emailID, "akshay@gmail.com");
        eleUtil.doSendKeys(password, "akshay@123");


    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }
}
