package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

    public static void main(String[] args) {

        String browserName = "chrome";
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please pass correct browser name: " + browserName);
        }

        driver.get("https://www.google.co.in/");

        String actTitle = driver.getTitle();
        System.out.println("Actual title: " + actTitle);

        String url = driver.getCurrentUrl();
        System.out.println("Actual url: " + url);

        if (actTitle.equals("Google")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if (url.contains("google.co.in")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        driver.quit();

    }
}