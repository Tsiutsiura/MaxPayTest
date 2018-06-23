package taskLoginPage.Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class General extends Assert {
    public General() {
    }


    /*ChromeOptions options = new ChromeOptions();
    options.addArguments("--lang=es");*/


    WebDriver driver = new ChromeDriver(/*options*/);
    WebDriverWait wait = new WebDriverWait(driver, 35);

    private static StringBuffer verificationErrors = new StringBuffer();

    public void sleep(int time) {
        //явное ожидание
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //неявное ожидание
        /* driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);*/

    }

    @Before
    public void openPage() {
        driver.get("https://my.maxpay.com/#/signin");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        //Close the browser
        driver.close();
        String verificationErrorString = verificationErrors.toString();

        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}
