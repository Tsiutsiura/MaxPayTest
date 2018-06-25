package taskLoginPage.Tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import taskLoginPage.Pages.LoginPage;
import taskLoginPage.Pages.SignUp;

public class TestSignUp extends General{


    @Test
    public void testMoveToSignUp(){
        LoginPage loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getForgotLinkLocator()));
        SignUp signUp = loginPage.beginSignUp();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(signUp.getEmailLocator()));
         assertEquals("You a still on Login page", signUp.getURL(), driver.getCurrentUrl().toString());
    }

}
