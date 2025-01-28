package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator) {
        getElement(locator).click();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public void doSendKeys(By locator, CharSequence... value) {
        getElement(locator).sendKeys(value);
    }

    public boolean isElementDisplayed(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element is not Displayed " + locator);
            return false;
        }
    }

    public String doGetElementText(By locator) {
        String eleText = getElement(locator).getText();
        if (eleText != null) {
            return eleText;
        } else {
            System.out.println("Element text is null: " + eleText);
            return null;
        }
    }

    public String doElementGetAttribute(By locator, String attrName) {
        return getElement(locator).getAttribute(attrName);
    }

    public int getElementsCount(By locator) {
        return getElements(locator).size();
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public void printElementList(By locator) {
        List<String> eleTextList = getElementsTextList(locator);
        for (String e : eleTextList) {
            System.out.println(e);
        }
    }

    public List<String> getElementsTextList(By locator) {
        List<WebElement> eleList = getElements(locator);
        List<String> eleTextList = new ArrayList<String>();
        for (WebElement e : eleList) {
            String eleText = e.getText();
            if (eleText.length() != 0) {
                eleTextList.add(eleText);
            }
        }
        return eleTextList;

    }

    public boolean doSearch(By searchField, By suggestions, String searchText, String matchText) throws InterruptedException {
        boolean flag = false;
        doSendKeys(searchField, searchText);
        Thread.sleep(1000);
        List<WebElement> suggList = getElements(suggestions);
        int totalSuggestions = suggList.size();
        System.out.println("Total suggestions===>" + totalSuggestions);
        if (totalSuggestions == 0) {
            System.out.println("No suggestions found....");
            throw new FrameWorkExceptions("No Suggestions Found..");
        }
        for (WebElement e : suggList) {
            String suggestionsText = e.getText();
            if (suggestionsText.contains(matchText)) {
                e.click();
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(matchText + " is found");
            return true;
        } else {
            System.out.println(matchText + " is not found");
            return false;
        }

    }

    public boolean isElementPresent(By locator, int expectedElementCount) {
        if (getElementsCount(locator) == expectedElementCount) {
            return true;
        }
        return false;
    }

    public boolean isElementPresent(By locator) {
        if (getElementsCount(locator) == 1) {
            return true;
        }
        return false;
    }

    public boolean isElementNotPresent(By locator) {
        if (getElementsCount(locator) == 0) {
            return true;
        }
        return false;
    }

    public boolean isElementPresentMultipleTimes(By locator) {
        if (getElementsCount(locator) >= 1) {
            return true;
        }
        return false;
    }


    //***********************Select Drop Down Utils ********************//

    private Select getSelect(By locator) {
        return new Select(getElement(locator));
    }

    public int getDropDownOptionsCount(By locator) {
        return getSelect(locator).getOptions().size();
    }

    public void selectDropDownValueByVisibleText(By locator, String visibleText) {
        getSelect(locator).selectByVisibleText(visibleText);
    }

    public void selectDropDownValueByIndex(By locator, int index) {
        getSelect(locator).selectByIndex(index);
    }

    public void selectDropDownValueByValue(By locator, String value) {
        getSelect(locator).selectByValue(value);
    }

    public List<String> getDropDownOptionsTextList(By locator) {
        List<WebElement> optionsList = getSelect(locator).getOptions();
        System.out.println("total number of options: " + optionsList.size());

        List<String> optionsTextList = new ArrayList<String>();
        for (WebElement e : optionsList) {
            String text = e.getText();
            optionsTextList.add(text);
        }

        return optionsTextList;
    }

    /*
     * select drop down value from the drop down using Select class
     */
    public void selectDropDownValueUsingSelect(By locator, String value) {
        List<WebElement> optionsList = getSelect(locator).getOptions();
        selectDropDown(optionsList, value);
    }

    /*
     * select drop down value from the drop down without using Select class
     */
    public void selectDropDownValue(By locator, String value) {
        List<WebElement> optionsList = getElements(locator);
        selectDropDown(optionsList, value);
    }

    private void selectDropDown(List<WebElement> optionsList, String value) {
        System.out.println("total number of options: " + optionsList.size());
        for (WebElement e : optionsList) {
            String text = e.getText();
            System.out.println(text);
            if (text.equals(value)) {
                e.click();
                break;
            }
        }
    }


}
