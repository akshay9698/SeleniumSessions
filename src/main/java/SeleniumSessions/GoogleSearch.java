package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearch {

    static WebDriver driver;




    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        By searchField = By.name("q");
        By suggetions = By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");


//        driver.findElement(By.name("q")).sendKeys("Selenium");
//        Thread.sleep(1000);
//        List<WebElement> suggetions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span"));
//        System.out.println(suggetions.size());
//
//        for (WebElement e : suggetions) {
//            String suggetionsText = e.getText();
//            if (suggetionsText.contains("Testing"))
//                System.out.println(suggetionsText);
//            e.click();
//            break;
//
//        }
        doSearch(searchField, suggetions, "Selenium", "testing");
    }

    public static void doSearch(By searchField, By suggetions, String searchText, String matchText) throws InterruptedException {

        driver.findElement(searchField).sendKeys(searchText);
        Thread.sleep(1000);
        List<WebElement> ActSuggetions = driver.findElements(suggetions);
        for (WebElement e : ActSuggetions) {
            String suggetionsText = e.getText();
            if (suggetionsText.contains(matchText))
                System.out.println(suggetionsText);
            e.click();
            break;
        }
    }

}
