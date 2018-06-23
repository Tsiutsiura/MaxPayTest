package taskLoginPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    private final WebDriver driver ;

    public SignUp(WebDriver driver) {
        this.driver=driver;
    }

    private final String URL = "https://my.maxpay.com/#/signup";
    private By emailLocator = By.id("email");

    public String getURL() {
        return URL;
    }

    public By getEmailLocator() {
        return emailLocator;
    }
}
