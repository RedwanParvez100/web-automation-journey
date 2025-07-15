package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

    public WebDriver browser;

    @BeforeMethod
    public void openBrowser(){
        browser = new ChromeDriver();
    }

    @AfterMethod
    public void quiteBrowser(){
        browser.close();
    }
}
