package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class TotalTextFields {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        List<WebElement> textFields = driver.findElements(By.className("form-control"));

        System.out.println("total fields==> " + textFields.size());
        for (WebElement e : textFields) {
            String placeholders = e.getAttribute("placeholder");
            System.out.println(placeholders);

        }

    }
}
