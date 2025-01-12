package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSessions {
    public static void main(String[] args) {
        // multiple drivers will be open
        WebDriver driver = new ChromeDriver(); // will open blank driver
        driver = new ChromeDriver();
        driver = new ChromeDriver();

        // driver.quit();//will close last driver

        driver.close(); // will close last driver
    }
}
