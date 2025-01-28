package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//        driver.findElement(By.id("input-email")).sendKeys("akshay@gmail.com");
//        String value = driver.findElement(By.id("input-email")).getAttribute("value");
//        System.out.println(value);

        By email = By.id("input-email");

        doSendKeys(email, "akshay@gmail.com");
        String value = doElementGetAttribute(email, "value");
        System.out.println(value);
    }

    public static void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public static String doElementGetAttribute(By locator, String attrName) {
        return getElement(locator).getAttribute(attrName);
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
