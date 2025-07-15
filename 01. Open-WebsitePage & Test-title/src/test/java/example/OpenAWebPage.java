package example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class OpenAWebPage extends DriverSetup{

   @Test
    public void openSailorPageAndTestTitle(){
      browser.get("https://www.sailor.clothing/");
      // System.out.println(browser.getTitle());
      Assert.assertEquals(browser.getTitle(),"Sailor | Sailing Life");
    }

    @Test
    public void openGooglePageAndTestTitle(){
        browser.get("https://www.google.com/");
        Assert.assertEquals(browser.getTitle(),"Google");
    }
}
