package TestCases;

import Pages.BaseTest;
import Pages.LoginPage;
import Utilities.ReadExcelFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.SplittableRandom;

public class LoginTest extends BaseTest {

    @Test(priority =1)
    void verifyLogin() {
        LoginPage lp = new LoginPage(driver);
        String username = "Demo12";
        String password = "Test123456$";
        lp.loginPortal(username, password);
    }

}
