package regression.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Order_Tracking_Page extends Base_Page {
    @FindBy(xpath = "//a[@id='cookie_action_close_header']")
    WebElement cookie_accept_btn;

    @FindBy(linkText = "Order Tracking")
    WebElement Order_Tracking_Link;

    @FindBy(xpath = "//input[@id='orderid']")
    WebElement orderid;

    @FindBy(xpath = "//input[@id='order_email']")
    WebElement order_email;

    @FindBy(xpath = "//button[contains(text(),'Track')]")
    WebElement Track_Btn;

    @FindBy(xpath = "//li[contains(text(),'Sorry, the order could not be found. Please contac')]")
    WebElement Error_Msg;


    public void clickOnOrderTrackingLink() {

        cookie_accept_btn.click();
        Order_Tracking_Link.click();
    }
    public void enterOrderDetails(){
        orderid.sendKeys("2536241");
        order_email.sendKeys("test@email.com");
        Track_Btn.click();
    }
    public void errorMessage(){
        String error_msg = Error_Msg.getText().trim();
        String expected_error_msg = ("Sorry, the order could not be found. Please contact us if you are having difficulty finding your order details.");
        Assert.assertEquals(error_msg, expected_error_msg);

    }

}
