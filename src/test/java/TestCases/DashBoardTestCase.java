package TestCases;

import Pages.BaseTest;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Utilities.ReadExcelFile;
import org.testng.annotations.Test;

public class DashBoardTestCase extends BaseTest {
    String fileName = System.getProperty("user.dir")+"\\TestData\\LoginPortalData.xlsx";

    @Test(priority = 1)
    void testCourses(){
        LoginPage lp = new LoginPage(driver);
        String username = ReadExcelFile.getCellValue(fileName,"LoginData",1,0);
        String password = ReadExcelFile.getCellValue(fileName,"LoginData",1,1);
        lp.loginPortal(username,password);

        DashBoardPage dbp = new DashBoardPage(driver);
        dbp.dashboardClick();
    }
}
