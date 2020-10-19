package regression.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import regression.BrowserFactory;


public class Base_Page {

      WebDriver driver;

    public Base_Page(){
        driver = BrowserFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

}
