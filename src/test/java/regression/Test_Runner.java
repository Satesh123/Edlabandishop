package regression;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
                "json:target/cucumber-json-report.json"}

    //    ,tags = {"@02"}

)


public class Test_Runner {
    static WebDriver driver;

    @BeforeClass
    public static void startBrowser() throws MalformedURLException {
        driver = BrowserFactory.getDriver();

    }

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
        driver.quit();
        driver = null;
    }


}
