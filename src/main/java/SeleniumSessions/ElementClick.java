package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//      create WebElement (FE) + Perform Actions

//        driver.findElement(By.linkText("Login")).click();
//        driver.findElement(By.linkText("Register")).click();
//        driver.findElement(By.name("agree")).click();

        By loginLink = By.linkText("Login");
        By registerLink = By.linkText("Register");
        By agreeCheckbox = By.name("agree");

        doClick(loginLink);
        doClick(registerLink);
        doClick(agreeCheckbox);

    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doClick(By locator) {
        getElement(locator).click();
    }

}
