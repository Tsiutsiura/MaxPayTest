package taskLoginPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage {

    private final WebDriver driver;
    private final String URL = "https://my.maxpay.com/#/signin";
    private By emailLocator = By.id("login-email");
    private By passwordLocator = By.id("login-password");
    private By submitButtonLocator = By.xpath("//button[@class = 'btn btn-block btn-primary mheight-40 text-uppercase ng-binding']");
    private By errorEmailOrPasswordLocator = By.xpath("//*[text()='Некорректны пароль или email']");
    private By errorEmailLocator = By.id("login-email-error");
    private By errorPasswordLocator = By.id("login-password-error");
    private By forgotLinkLocator = By.linkText("Забыли пароль?");
    private By signUpLinkLocator = By.linkText("Зарегистрироваться");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return URL;
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

    public By getForgotLinkLocator() {
        return forgotLinkLocator;
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

    public ForgotPassword initiateForgotPassword(){
        driver.findElement(forgotLinkLocator).click();
        return new ForgotPassword(driver);
    }

        public Dashboard submitLoginPage() {
        driver.findElement(submitButtonLocator).click();
        return new Dashboard(driver);
    }
    public SignUp beginSignUp() {
        driver.findElement(signUpLinkLocator).click();
        return new SignUp(driver);
    }

}
