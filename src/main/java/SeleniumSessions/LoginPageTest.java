package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

    public static void main(String[] args) {
        BrowserUtil brUtil = new BrowserUtil();
        WebDriver driver = brUtil.initDriver("chrome");
        brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        System.out.println(brUtil.getPageTitle());
        By emailID = By.id("input-email");
        By password = By.id("input-password");

        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSendKeys(emailID, "akshay@gmail.com");
        eleUtil.doSendKeys(password, "akshay@123");

        brUtil.quitBrowser();

    }
}
