package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        // 1. id : is an attribute: unique -I
//        driver.findElement(By.id("input-firstname")).sendKeys("ak");
//        driver.findElement(By.id("input-lastname")).sendKeys("k");

        // 2. name : is an attribute: can be duplicate -II
//        driver.findElement(By.name("firstname")).sendKeys("ak");
//        driver.findElement(By.name("lastname")).sendKeys("k");

        // 3. className: is an attribute: can be duplicate
//        driver.findElement(By.className("form-control")).sendKeys("ak");

        // 4. xpath: is not an attribute, address of the WebElement in the DOM
//        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("ak");
//        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("k");
//        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

        // 5. cssSelector: is not an attribute
        // css: Cascaded style sheet
//        driver.findElement(By.cssSelector("#input-firstname")).sendKeys("AK");
//        driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();

        // 6. linkText: used for links: it can be duplicate
        // html tag = <a>
//        driver.findElement(By.linkText("Forgotten Password")).click();

        // 7. partialLinkText: used for links: it can be duplicate
//        driver.findElement(By.partialLinkText("Forgotten")).click();

        // 8. tagName:
        String header = driver.findElement(By.tagName("h1")).getText();
        System.out.println(header);
        if (header.equals("Register Account")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }
}
