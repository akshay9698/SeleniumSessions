package SeleniumSessions;

public class CustomXpath {

    public static void main(String[] args) {

        //xpath: XML Path: HTML XML PATH: address of the element in the DOM
        //DOM: HTML + XML

        //1. absolute xpath: /html/body/div[2]/div/div/div/div[2]/div/form/input
        //2. relative xpath: relative attributes of the element: id, class, name, type, text


        //htmltag[@attr = 'value']

        //input[@id='input-email'] --- 1
        //input[@name='email'] --1
        //input[@type='text'] ---2

        //htmltag[@attr1='value' and attr2='value']
        //input[@name='email' and @id='input-email'] ---1
        //input[@name='email' and @id='input-email' and @type='text']---1
        //input[@name='email' and @id='input-email' and @type='text' and @placeholder='E-Mail Address']---1

        //input[@type='text' or @name='password'] -- 3


        //text():
        //htmltag[text()='value']
        //a[text()='Register']

        //h2[text()='New Customer']
        //label[text()='E-Mail Address']

        //a -- total links
        //img
        //h1
        //input
        //a[@href]
        //input[@id]

        //amazon:
        //a -- 381 -- total links on the page
        //a[@href] -- 372
        //a[not(@href)] -- 4


//		driver.findElements(By.xpath("//a[@href]"));
//		driver.findelements(By.tagName("a"));

    }
}
