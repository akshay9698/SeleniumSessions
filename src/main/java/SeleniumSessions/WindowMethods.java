package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // will maximize the window
        // driver.manage().window().fullscreen(); // this will used for big screen m/c Fit to screen
        //  driver.manage().window().minimize(); // will minimize the window

        driver.get("https://www.google.com");
    }
}
