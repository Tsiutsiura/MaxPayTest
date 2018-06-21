package TestLogin;

import Pages.Dashboard;
import Pages.ForgotPassword;
import Pages.LoginPage;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import junitparams.Parameters;
import org.testng.annotations.BeforeTest;


@RunWith(JUnitParamsRunner.class)

public class TestLogin extends General {

    private static StringBuffer verificationErrors = new StringBuffer();


    @Test
    @Parameters({"test.tsiutsiura@gmail.com,Test12345"})
    public void testLoginPositive(String email, String password) throws Exception {
        openPage();
        LoginPage loginPage = new LoginPage(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getEmailLocator()));
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        Dashboard dashboard = loginPage.submitLoginPage();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dashboard.getControlLocator()));
        assertEquals("You a still on Login page", dashboard.getURL(), driver.getCurrentUrl().toString());

    }

    @Test
    @Parameters({
            ", Test",
            "@#$%%^^_+, Test",
    })
    public void testLoginNegEmail(String email, String password) throws Exception {
        openPage();
        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getEmailLocator()));
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.submitLoginPage();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loginPage.getErrorEmailLocator()));
        assertEquals("Error not matched in field email", "Пожалуйста, введите действующий email адрес", loginPage.errorEmail().toString());

    }


    @Test
    @Parameters({

            ", ",
            "tsiutsiura1115@gmail.com, "
    })
    public void testLoginNegPassword(String email, String password) throws Exception {
        openPage();
        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getEmailLocator()));
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.submitLoginPage();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loginPage.getErrorPasswordLocator()));
        assertEquals("Error not matched in field email", "Пожалуйста, введите пароль", loginPage.errorPassword().toString());

    }

    @Test
    @Parameters({
            "test.tsiutsiura@gmail.com, Test", //correct email, incorrect password
            "tsiutsiura@gmail.com, Test12345" // incorrect email, correct password
    })

    public void testLoginNegOneWrong(String email, String password) throws Exception {
        openPage();
        LoginPage loginPage = new LoginPage(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getEmailLocator()));
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.submitLoginPage();

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getErrorEmailOrPasswordLocator()));
        assertEquals("Error not matched, when problem with someone email or password", "Некорректны пароль или email", loginPage.errorEmailOrPassword().toString());

    }

    @Test
    public void testGoToForgotPassword ()throws Exception{
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
