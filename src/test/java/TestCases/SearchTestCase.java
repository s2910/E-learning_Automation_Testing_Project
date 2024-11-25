package TestCases;

import Pages.BaseTest;
import Pages.LoginPage;
import Pages.SearchPage;
import Utilities.ReadExcelFile;
import org.testng.annotations.Test;


public class SearchTestCase extends BaseTest {
    String fileName=System.getProperty("user.dir")+"\\TestData\\LoginPortalData.xlsx";
    @Test(priority = 1)
    void searchCourseTest(){
        LoginPage lp = new LoginPage(driver);
        String username = ReadExcelFile.getCellValue(fileName,"LoginData",1,0);
        String password = ReadExcelFile.getCellValue(fileName,"LoginData",1,1);
        lp.loginPortal(username,password);

        SearchPage sp = new SearchPage(driver);
        String searchCourse = ReadExcelFile.getCellValue(fileName,"SearchData",2,0);
        sp.searchCourse(searchCourse);
    }
}
