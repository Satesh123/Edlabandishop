package regression.PageObject;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.text.TextProducer;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Shopping_Page extends Base_Page {

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement Search;
    @FindBy(xpath = "//input[@class='search-field search-input live-search-input tt-input']")
    WebElement Search_Box_Input;
    @FindBy(partialLinkText = "BARN YARD MILLET RI")
    WebElement Barn_Yard_Rice;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement Add_To_Cart;
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement Checkout_Btn;
    @FindBy(id = "billing_first_name")
    WebElement billing_first_name;
    @FindBy(id = "billing_last_name")
    WebElement billing_last_name;
    @FindBy(id = "billing_address_1")
    WebElement billing_address_1;
    @FindBy(id = "billing_city")
    WebElement billing_city;
    @FindBy(id = "billing_postcode")
    WebElement billing_postcode;
    @FindBy(id = "billing_phone")
    WebElement billing_phone;
    @FindBy(id = "billing_email")
    WebElement billing_email;
    @FindBy(id = "ship-to-different-address-checkbox")
    WebElement ship_to_different_address_checkbox;
    @FindBy(xpath = "//button[@id='place_order']")
    WebElement Proceed_to_PayPal_Btn;
    @FindBy(xpath = "//li[contains(text(),'Please read and accept the terms and conditions to')]")
    WebElement error_message;
    @FindBy(id = "order_comments")
    WebElement order_comments;
    @FindBy(className = "plus")
    WebElement plus;

    public void searchProduct(String product) {
        Search.click();
        Search_Box_Input.clear();
        Search_Box_Input.sendKeys(product);
    }

    public void add_Item_To_Shopping_Cart() {
        Barn_Yard_Rice.click();
        plus.click();
        Add_To_Cart.click();
    }

    public void checkout() {

        Checkout_Btn.click();
    }

    public void billingDetails() throws InterruptedException {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();
        TextProducer text = fairy.textProducer();

        billing_first_name.sendKeys(person.getFirstName());
        billing_last_name.sendKeys(person.getLastName());
        billing_address_1.sendKeys(text.randomString(6));
        billing_city.sendKeys(text.randomString(6));
        billing_postcode.sendKeys(text.randomString(6));
        billing_phone.sendKeys(person.getTelephoneNumber());
        billing_email.sendKeys(person.getEmail());
        order_comments.sendKeys(text.paragraph());
        //  ship_to_different_address_checkbox.click();
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.moveToElement(Proceed_to_PayPal_Btn).click().build().perform();

    }

    public void errorMsg() throws InterruptedException {
        Thread.sleep(1000);
        String error_msg = error_message.getText().trim();
        String expected_error_msg = ("Please read and accept the terms and conditions to proceed with your order.");
        Assert.assertEquals(error_msg, expected_error_msg);

    }

}
