package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage {

    private final WebDriver driver;

    private By emailLocator = By.id("login-email");
    private By passwordLocator = By.id("login-password");
    private By submitButtonLocator = By.xpath("//button[@class = 'btn btn-block btn-primary mheight-40 text-uppercase ng-binding']");

    private By errorEmailOrPasswordLocator = By.xpath("//p[text()='Некорректны пароль или email']");

    private By errorEmailLocator = By.id("login-email-error");
    private By errorPasswordLocator = By.id("login-password-error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public By getEmailLocator() {
        return emailLocator;
    }

    public By getPasswordLocator() {
        return passwordLocator;
    }

    public By getSubmitButtonLocator() {
        return submitButtonLocator;
    }

    public By getErrorEmailOrPasswordLocator() {
        return errorEmailOrPasswordLocator;
    }

    public By getErrorEmailLocator() {
        return errorEmailLocator;
    }

    public By getErrorPasswordLocator() {
        return errorPasswordLocator;
    }



    public LoginPage typeEmail(String email) {
        driver.findElement(emailLocator).click();
        driver.findElement(emailLocator).sendKeys(email);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).click();
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public String errorEmailOrPassword() {
        return  driver.findElement(errorEmailOrPasswordLocator).getText();
    }

    public String errorEmail() {
        return   driver.findElement(errorEmailLocator).getText().toString();

    }

    public String errorPassword() {
      return  driver.findElement(errorPasswordLocator).getText().toString();

    }


    public Dashboard submitLoginPage() {
        driver.findElement(submitButtonLocator).click();
        return new Dashboard(driver);
    }


}
