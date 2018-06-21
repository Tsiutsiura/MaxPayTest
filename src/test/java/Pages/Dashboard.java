package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

    private final WebDriver driver;


    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    private final String URL = "https://my.maxpay.com/app.php#/app/dashboard";
    private By controlLocator = By.xpath("//span[text() = 'Объем']");

    public By getControlLocator() {
        return controlLocator;
    }

    public String getURL() {
        return URL;
    }


}
