package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    private static final int MAX_TIMEOUT = 60;

    static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            return createDriverInstance();
        }
        return driver;
    }

    private static WebDriver createDriverInstance() {
        String BROWSER = System.getProperty("BROWSER");

        if (BROWSER == null) {
            BROWSER = "CHROME";
        }


        if (BROWSER.equalsIgnoreCase("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (BROWSER.equalsIgnoreCase("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (BROWSER.equalsIgnoreCase("SAFARI")) {
            driver = new SafariDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }


        driver.manage().timeouts().implicitlyWait(MAX_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        return driver;
    }
}
