package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckElementPresent {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By logo = By.className("img-responsive");
        By footerLinks = By.xpath("//div[@class='col-sm-3']/ul//a");
//        int count= getElementCount(logo);
//        if(count==1){
//            System.out.println("logo is present");
//        }else {
//            System.out.println("logo is not present");
//        }

        System.out.println(isElementPresent(logo));
        System.out.println(isElementPresent(logo, 1));
        getElementCount(footerLinks);

        List<WebElement> fLinksList = getElements(footerLinks);
        System.out.println(fLinksList.size());
        for (WebElement e : fLinksList) {
            String linkText = e.getText();
            System.out.println(linkText);
        }


    }

    public static boolean isElementNotPresent(By locator) {
        if (getElementCount(locator) == 0) {
            return true;
        }
        return false;
    }

    public static boolean isElementPresentMultipleTimes(By locator) {
        if (getElementCount(locator) >= 1) {
            return true;
        }
        return false;
    }

    public static boolean isElementPresent(By locator, int expectedElementCount) {
        if (getElementCount(locator) == expectedElementCount) {
            return true;
        }
        return false;
    }

    public static boolean isElementPresent(By locator) {
        if (getElementCount(locator) == 1) {
            return true;
        }
        return false;
    }

    public static List<WebElement> getElements(By locator) {
        List<WebElement> eleList = driver.findElements(locator);
        return eleList;
    }

    public static int getElementCount(By locator) {
        return getElements(locator).size();
    }
}
