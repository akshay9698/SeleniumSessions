package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectDropDownWithoutSelectClass {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/30-day-free-trial");

        By options = By.xpath("//Select[@id='Form_getForm_Country']/option");

        List<WebElement> conOptions = driver.findElements(options);
        for (WebElement e : conOptions) {
            String text = e.getText();
            if (text.equals("India")) {
                e.click();
                break;
            }
        }

    }
}
