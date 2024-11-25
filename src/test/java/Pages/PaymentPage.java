package Pages;

import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;
    public PaymentPage(WebDriver ldriver){
        this.driver=ldriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//label[@for='payment_method_stripe']") WebElement payStripeClick;
    @FindBy(xpath="//input[@name='learn_press_checkout_place_order']") WebElement placeOrderBtn;
    @FindBy(xpath="//*[@id=\"card-element\"]/div/iframe") WebElement frameElement;
    @FindBy(xpath="//input[@placeholder='Card number']") WebElement cardNumber;
    @FindBy(xpath="//input[@placeholder='MM / YY']") WebElement expDate;
    @FindBy(xpath="//input[@placeholder='CVC']") WebElement cvc;
    @FindBy(xpath = "//input[@placeholder='ZIP']") WebElement zipCode;
    @FindBy(xpath="//button[@id='payment-button']") WebElement paybtn;

    public void paymentOption(String cardNum,String exp,String cvcnum,String zip) throws InterruptedException {
        payStripeClick.click();
        placeOrderBtn.submit();
        driver.switchTo().frame(frameElement);
        cardNumber.sendKeys(cardNum);
        expDate.sendKeys(exp);
        cvc.sendKeys(cvcnum);
        zipCode.sendKeys(zip);


        driver.switchTo().defaultContent();

        paybtn.click();
    }
}
