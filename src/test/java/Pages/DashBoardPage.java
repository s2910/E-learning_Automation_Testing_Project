package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
    WebDriver driver;
    public DashBoardPage(WebDriver ldriver){
        this.driver=ldriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dashboardclick;

    @FindBy(xpath="//a[normalize-space()='Offered Academies']") WebElement offerAcademis;

    @FindBy(xpath = "//li[1]//form[1]//div[1]//button[1]") WebElement subscribeButton;

    public void dashboardClick(){
        dashboardclick.click();
        offerAcademis.click();
        subscribeButton.click();
    }

}
