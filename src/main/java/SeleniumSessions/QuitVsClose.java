package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        String actTitle = driver.getTitle();
        System.out.println("Actual title: " + actTitle);

        String url = driver.getCurrentUrl();
        System.out.println("Actual url: " + url);

        //driver.quit();
        //driver.getTitle(); //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
        driver.close();
        driver.getTitle(); //NoSuchSessionException: invalid session id
    }
}
