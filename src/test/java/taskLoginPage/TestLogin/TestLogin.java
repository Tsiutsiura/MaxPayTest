package taskLoginPage.TestLogin;

import taskLoginPage.Pages.Dashboard;
import taskLoginPage.Pages.ForgotPassword;
import taskLoginPage.Pages.LoginPage;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.Collection;


@RunWith(JUnitParamsRunner.class)

public class TestLogin extends General {
    private String email;
    private String password;
    private String fieldSearch;
    private String url;

    private static StringBuffer verificationErrors = new StringBuffer();

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(
                new Object[][]{

                        {"tsiutsiura1115@gmail.com", "Test12345", "Некорректны пароль или email", "https://my.maxpay.com/#/signin"},
                        {"!@$#%", "", "Пожалуйста, введите действующий email адрес", "https://my.maxpay.com/#/signin"},
                        {"test.tsiutsiura@gmail.com", "", "Пожалуйста, введите пароль", "https://my.maxpay.com/#/signin"},
                        {"test.tsiutsiura@gmail.com", "Test12345", "Объем", "https://my.maxpay.com/app.php#/app/dashboard"}
                }
        );

    }

    public TestLogin(String email, String password, String fieldSearch, String URL) {
        this.email = email;
        this.password = password;
        this.fieldSearch = fieldSearch;
        this.url = URL;
    }

    @BeforeTest
    public void first() {
        openPage();
    }

    @Test
    public void testLoginPositive() throws Exception {


        LoginPage loginPage = new LoginPage(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getEmailLocator()));

        loginPage.typeEmail(email);
        System.out.println("Email:" + " '" + email + "'");
        loginPage.typePassword(password);
        System.out.println("Password:" + " '" + password + "'");
        Dashboard dashboard = loginPage.submitLoginPage();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + fieldSearch + "']")));
        assertEquals("url doesn't matched", url, driver.getCurrentUrl().toString());

    }

    @Test
    public void testGoToForgotPassword() throws Exception {
        openPage();
        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getForgotLinkLocator()));
        ForgotPassword fp = loginPage.initiateForgotPassword();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fp.getButtonResetPasswordLocator()));
        assertEquals("You a still on Login page", fp.getURL(), driver.getCurrentUrl().toString());


    }


    @AfterTest
    public void tearDown() {
        //Close the browser
        driver.close();
        String verificationErrorString = verificationErrors.toString();

        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}
