package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

    public static void main(String[] args) {

        BrowserUtil brUtil = new BrowserUtil();
        WebDriver driver = brUtil.initDriver("chrome");
        brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By firstName = By.id("input-firstname");
        By lastName = By.name("lastname");
        By emailID = By.id("input-email");
        By telephone = By.xpath("//*[@id=\"input-telephone\"]");
        By password = By.cssSelector("#input-password");
        By confPassword = By.id("input-confirm");
        By agreeCheck = By.name("agree");
        By btnContinue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSendKeys(firstName, "ak");
        eleUtil.doSendKeys(lastName, "kk");
        eleUtil.doSendKeys(emailID, "ak@gmail.com");
        eleUtil.doSendKeys(telephone, "1234567890");
        eleUtil.doSendKeys(password, "ak@123");
        eleUtil.doSendKeys(confPassword, "ak@123");
        eleUtil.doClick(agreeCheck);
        //eleUtil.doClick(btnContinue);

    }
}
