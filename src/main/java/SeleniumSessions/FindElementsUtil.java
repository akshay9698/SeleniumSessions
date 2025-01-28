package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FindElementsUtil {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By links = By.tagName("a");
        By images = By.tagName("img");

//        int totalLinks = getElementsCount(links);
//        System.out.println(totalLinks);

        List<String> eleText = getElementsTextList(links);
        System.out.println(eleText.contains("About Us"));

        printElementList(links);

    }

    public static void printElementList(By locator) {
        List<String> eleTextList = getElementsTextList(locator);
        for (String e : eleTextList) {
            System.out.println(e);
        }
    }

    public static List<String> getElementsTextList(By locator) {
        List<WebElement> eleList = getElements(locator);
        List<String> eleTextList = new ArrayList<String>();
        for (WebElement e : eleList) {
            String eleText = e.getText();
            if (eleText.length() != 0) {
                eleTextList.add(eleText);
            }
        }
        return eleTextList;

    }

    public static int getElementsCount(By locator) {
        return getElements(locator).size();
    }

    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }
}
