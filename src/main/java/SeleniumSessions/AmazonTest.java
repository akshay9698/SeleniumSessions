package SeleniumSessions;

public class AmazonTest {

    public static void main(String[] args) {

        BrowserUtil browserUtil = new BrowserUtil();
        browserUtil.initDriver("chrome");
        browserUtil.launchUrl("https://www.amazon.com");

        String title = browserUtil.getPageTitle();
        System.out.println(title);
        if (title.contains("Amazon")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println(browserUtil.getPageURL());

        browserUtil.quitBrowser();
    }
}
