package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

    public static void main(String[] args) {
        WebDriver driver = null;
        String browser = "Chrome";

        switch (browser.trim().toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Pleas pass right browser: " + browser);
                throw new BrowserException("=======Invalid Browser=========");
                //break;
        }

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        System.out.println("page title is: " + driver.getTitle());
        System.out.println("page url is: " + driver.getCurrentUrl());

        driver.quit();
    }
}
