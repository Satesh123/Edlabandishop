package regression.PageObject;

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

    public void searchProduct(String product) {
        Search.click();
        Search_Box_Input.clear();
        Search_Box_Input.sendKeys(product);
    }

    public void add_Item_To_Shopping_Cart() {
        Barn_Yard_Rice.click();
        Add_To_Cart.click();
    }

    public void checkout() {

        Checkout_Btn.click();
    }

    public void billingDetails() throws InterruptedException {
        billing_first_name.sendKeys("Test");
        billing_last_name.sendKeys("Order");
        billing_address_1.sendKeys("101");
        billing_city.sendKeys("London");
        billing_postcode.sendKeys("IG1 5SP");
        billing_phone.sendKeys("07425369844");
        billing_email.sendKeys("test@email.com");
        ship_to_different_address_checkbox.click();
        Thread.sleep(5000);
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.visibilityOf(Proceed_to_PayPal_Btn));
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
