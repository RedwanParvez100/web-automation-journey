package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {

        browser.get("https://trytestingthis.netlify.app/");
        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());

        WebElement firstName = browser.findElement(By.id("fname"));
        firstName.sendKeys("Redwan");
        Thread.sleep(1000);

        WebElement lastName = browser.findElement(By.name("lname"));
        lastName.sendKeys("Parvez");
        Thread.sleep(1000);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement text = browser.findElement(By.className("ui-autocomplete-input"));
        text.sendKeys("locate using Classname");
        Thread.sleep(1000);

//        WebElement openTab = browser.findElement(By.linkText("Open Tab"));
//        openTab.click();
//        Thread.sleep(12000);

        WebElement partialLinkText = browser.findElement(By.partialLinkText("Free Access to InterviewQues"));
//        partialLinkText.click();
        System.out.println(partialLinkText.getText());
        Thread.sleep(3000);

        WebElement radiobutton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
        radiobutton1.click();
        Thread.sleep(3000);

        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        selectDropdown.click();
        Thread.sleep(3000);



    }
}
