package regression.PageObject;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
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

    public void enterOrderDetails() {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        orderid.sendKeys(person.getTelephoneNumber());
        order_email.sendKeys(person.getEmail());
        Track_Btn.click();
    }

    public void errorMessage() {
        String error_msg = Error_Msg.getText().trim();
        String expected_error_msg = ("Sorry, the order could not be found. Please contact us if you are having difficulty finding your order details.");
        Assert.assertEquals(error_msg, expected_error_msg);

    }

}
