package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup{


    @Test
    public void openSailorPageAndTitleTest(){
        // WebDriver browser = new ChromeDriver();
        browser.get("https://www.sailor.clothing/");
        System.out.println(browser.getTitle());
        Assert.assertEquals(browser.getTitle(),"Sailor | Sailing Life");
        // browser.close();
    }

    @Test
    public void openGooglePageAndTitleTest(){
        browser.get("https://www.google.com/");
        System.out.println(browser.getTitle());
        Assert.assertEquals(browser.getTitle(),"Google");
    }

}
