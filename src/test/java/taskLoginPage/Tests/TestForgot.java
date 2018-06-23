package taskLoginPage.Tests;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
;
import org.openqa.selenium.support.ui.ExpectedConditions;
import taskLoginPage.Pages.ForgotPassword;
import taskLoginPage.Pages.LoginPage;

@RunWith(JUnitParamsRunner.class)
public class TestForgot extends General{



    @Test
    @Parameters({
            "",
            "    ",
            "test",
            "@#%$#^%&",
            "test@hsaf",
            "test.tsiutsiuragmail.com",
            "test.tsiutsiura@gmail",
            "test.tsiutsiura@gmail.com"
    })
    public void testValidation(String email)throws Exception{

        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getForgotLinkLocator()));
        ForgotPassword fp = loginPage.initiateForgotPassword();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fp.getButtonResetPasswordLocator()));
        assertEquals("You a still on Login page", fp.getURL(), driver.getCurrentUrl().toString());
        fp.typeEmail(email);
        fp.resetPassword();
    }

    @Test
    public void testMoveToSignIn()throws Exception{

        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getForgotLinkLocator()));
        ForgotPassword fp = loginPage.initiateForgotPassword();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fp.getButtonResetPasswordLocator()));
        assertEquals("You a still on Login page", fp.getURL(), driver.getCurrentUrl().toString());
        fp.startSignIn();
        assertEquals("You a still on Forgo Password page", loginPage.getURL(), driver.getCurrentUrl().toString());
    }



}
