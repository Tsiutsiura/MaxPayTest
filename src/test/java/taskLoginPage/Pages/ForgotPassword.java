package taskLoginPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private final WebDriver driver;

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    private final String URL = "https://my.maxpay.com/#/forgot";
    private By reminderEmailLocator = By.id("reminder-email");
    private By buttonResetPasswordLocator = By.xpath("//button[@type='submit']");
    private By signInLocator = By.linkText("Войти");

    public String getURL() {
        return URL;
    }

    public By getReminderEmailLocator() {
        return reminderEmailLocator;
    }

    public By getButtonResetPasswordLocator() {
        return buttonResetPasswordLocator;
    }

    public ForgotPassword typeEmail(String email) {
        driver.findElement(reminderEmailLocator).click();
        driver.findElement(reminderEmailLocator).sendKeys(email);
        return this;
    }

    public ForgotPassword resetPassword() {
        driver.findElement(buttonResetPasswordLocator).click();
        return this;
    }

    public LoginPage startSignIn (){
        driver.findElement(signInLocator).click();
        return new LoginPage(driver);
    }


}
