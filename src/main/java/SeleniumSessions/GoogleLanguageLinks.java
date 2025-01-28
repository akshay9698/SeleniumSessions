package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleLanguageLinks {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

        System.out.println(langList.size());
        for (WebElement e : langList) {
            String langText = e.getText();
            System.out.println(langText);
            if (langText.equals("मराठी")) {
                e.click();
                break;
            }

        }
    }
}
