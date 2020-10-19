package regression;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.PageObject.Order_Tracking_Page;
import regression.PageObject.Shopping_Page;

public class Shopping_StepDef extends Test_Runner {

    public Shopping_Page shopping_page;
    public Order_Tracking_Page order_tracking_page;

    @Before
    public void start_test() {
        shopping_page = new Shopping_Page();
        order_tracking_page = new Order_Tracking_Page();

    }

    @After
    public void stop(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }
    }

    @Given("^Launch Application$")
    public void launchApplication() {

        driver.get("https://www.edlabandishop.co.uk");
        driver.manage().window().maximize();

    }

    @When("^Click on search icon on homepage and type \"([^\"]*)\" and press enter$")
    public void clickOnSearchIconOnHomepageAndTypeAndPressEnter(String product)  {
        shopping_page.searchProduct(product);

    }

    @And("^Add item into shopping cart$")
    public void addItemIntoShoppingCart()  {
        shopping_page.add_Item_To_Shopping_Cart();
    }

    @When("^Click on checkout button$")
    public void clickOnCheckoutButton() {
        shopping_page.checkout();
    }

    @And("^Enter billing details and click on Proceed to Paypal button$")
    public void enterBillingDetailsAndClickOnProceedToPaypalButton() throws InterruptedException {

        shopping_page.billingDetails();
    }

    @Then("^verify you get the error message saying you need to accept$")
    public void verifyYouGetTheErrorMessageSayingYouNeedToAccept() throws InterruptedException {

        shopping_page.errorMsg();
    }
//=========================Order Tracking=================================================

    @When("^Click on Order Tracking link on homepage footer$")
    public void clickOnOrderTrackingLinkOnHomepageFooter() throws InterruptedException {

        order_tracking_page.clickOnOrderTrackingLink();

    }

    @And("^Enter Order ID and Billing Email and click on Track button$")
    public void enterOrderIDAndBillingEmailAndClickOnTrackButton() {
        order_tracking_page.enterOrderDetails();

    }

    @Then("^You get an error message$")
    public void youGetAnErrorMessage() {
        order_tracking_page.errorMessage();
    }
}
