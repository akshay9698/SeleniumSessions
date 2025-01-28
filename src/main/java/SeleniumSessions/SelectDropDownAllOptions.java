package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectDropDownAllOptions {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/30-day-free-trial");

        By country = By.id("Form_getForm_Country");

//        Select select = new Select(driver.findElement(country));
//        List<WebElement> eleList = select.getOptions();
//        System.out.println(eleList.size());
//        for (WebElement e : eleList) {
//            String text = e.getText();
//            System.out.println(text);
//        }


        List<String> optionsList = getDropDownOptionsTextList(country);
//       System.out.println(optionsList.size());
//       if(optionsList.contains("India")){
//           System.out.println("PASS");
//       }

        List<String> exOptionsList = Arrays.asList("India", "Brazil", "Japan");
        if (optionsList.containsAll(exOptionsList)) {
            System.out.println("PASS");
        }

    }

    public static List<String> getDropDownOptionsTextList(By locator) {
        Select select = new Select(getElement(locator));
        List<WebElement> eleList = select.getOptions();
        List<String> optionsList = new ArrayList<String>();
        System.out.println(eleList.size());
        for (WebElement e : eleList) {
            String text = e.getText();
            optionsList.add(text);
        }
        return optionsList;
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
