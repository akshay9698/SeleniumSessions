package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class BrowserException extends RuntimeException {

    public BrowserException(String msg) {
        super(msg);
    }
}
