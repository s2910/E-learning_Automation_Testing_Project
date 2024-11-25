package TestCases;

import Pages.BaseTest;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Pages.PaymentPage;
import Utilities.ReadExcelFile;
import org.testng.annotations.Test;

public class PaymentTestCase extends BaseTest {
    String fileName = System.getProperty("user.dir")+"\\TestData\\LoginPortalData.xlsx";

    @Test(priority = 1)
    void paymentForm() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        String username = ReadExcelFile.getCellValue(fileName,"LoginData",1,0);
        String password = ReadExcelFile.getCellValue(fileName,"LoginData",1,1);
        lp.loginPortal(username,password);

        DashBoardPage dbp = new DashBoardPage(driver);
        dbp.dashboardClick();

        PaymentPage pg = new PaymentPage(driver);
        String cardNum = ReadExcelFile.getCellValue(fileName,"CardDetails",0,0);
        String exp = ReadExcelFile.getCellValue(fileName,"CardDetails",0,1);
        String cvcnum = ReadExcelFile.getCellValue(fileName,"CardDetails",0,2);
        String zip = ReadExcelFile.getCellValue(fileName,"CardDetails",0,3);
        pg.paymentOption(cardNum,exp,cvcnum,zip);
    }
}
