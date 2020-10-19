package regression;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}

    //    ,tags = {"@02"}

)


public class Test_Runner {
    static WebDriver driver;

    @BeforeClass
    public static void startBrowser() throws MalformedURLException {
        driver = BrowserFactory.getDriver();
    }

    @AfterClass
    public static void stop() {
        driver.quit();
        driver = null;
    }


}
