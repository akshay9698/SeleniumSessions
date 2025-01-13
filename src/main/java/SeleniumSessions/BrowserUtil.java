package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

public class BrowserUtil {

    WebDriver driver;

    /**
     * this method is used to init driver on the basis of given browser name
     *
     * @param browserName
     * @return this return driver
     */
    public WebDriver initDriver(String browserName) {
        System.out.println("browser name is: " + browserName);
        switch (browserName.trim().toLowerCase()) {
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
                System.out.println("Pleas pass right browser: " + browserName);
                throw new BrowserException("=======Invalid Browser=========");
                //break;
        }
        return driver;
    }

    public void launchUrl(String url) {
        if (url.indexOf("http") != 0 || url.length() == 0) {
            throw new BrowserException("http(s) is missing in URL");
        }
        driver.get(url);
    }

    public void launchUrl(URL url) {
        driver.navigate().to(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    public void quitBrowser() {
        driver.quit();
    }

    public void closeBrowser() {
        driver.close();
    }


}
