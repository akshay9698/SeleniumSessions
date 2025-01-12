package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.amazon.com"); // both methods are doing same
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();

        driver.quit();


    }
}
