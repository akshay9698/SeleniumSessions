package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/30-day-free-trial");

        By country = By.id("Form_getForm_Country");
        WebElement drpCountry = driver.findElement(country);

        //Select select = new Select(drpCountry);
        //select.selectByVisibleText("India");
        //select.selectByIndex(3);
        //select.selectByValue("Brazil");
        //selectDropDownValueByVisibleText(country, "India");
        //selectDropDownValueByIndex(country, 9);
        //selectDropDownValueByValue(country, "India");
        int optionCount = getDropDownOptionsCount(country);
        System.out.println(optionCount);
    }

    public static int getDropDownOptionsCount(By locator) {
        Select select = new Select(getElement(locator));
        return select.getOptions().size();
    }

    public static void selectDropDownValueByVisibleText(By locator, String text) {
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(text);
    }

    public static void selectDropDownValueByIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public static void selectDropDownValueByValue(By locator, String value) {
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
