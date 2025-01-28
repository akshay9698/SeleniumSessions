package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int totalLinks = links.size();
        System.out.println(totalLinks);

//        for (int i = 0; i <= links.size() - 1; i++) {
//            String text = links.get(i).getText();
//            if (text.length() != 0) {
//                System.out.println(text);
//            }
//        }

        // count of blank text link and links with texts
        int blankTextLinksCount = 0;
        int linksWithTextCount = 0;
        for (int i = 0; i <= links.size() - 1; i++) {
            String Text = links.get(i).getText();
            if (Text.length() == 0) {
                blankTextLinksCount++;
            } else {
                linksWithTextCount++;
            }
        }

        System.out.println("Number of blank text links: " + blankTextLinksCount);
        System.out.println("Number of blank text links: " + linksWithTextCount);

        // by using for each loop
        int count = 0;
        for(WebElement e:links){
            String linkText = e.getText();
            if(linkText.length()!=0){
                System.out.println(count + "=" +linkText);
            }
            count++;
        }


    }
}
