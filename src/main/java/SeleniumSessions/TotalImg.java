package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class TotalImg {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");

        // total images
//        List<WebElement> totalImgs = driver.findElements(By.tagName("img"));
//        int totalImgCount = totalImgs.size();
//        System.out.println(totalImgCount);
//        for (WebElement e : totalImgs) {
//            String srcValue = e.getAttribute("src");
//            System.out.println(srcValue);
//        }

        // capture all the links and
        // print the links text and href value

        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println("total number of links: " + linksList.size());

        for (WebElement e : linksList) {
            String text = e.getText();
            String hrefValue = e.getAttribute("href");
            System.out.println(text + "  : " + hrefValue);
        }
    }
}

