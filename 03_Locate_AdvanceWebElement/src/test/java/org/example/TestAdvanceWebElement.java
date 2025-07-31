package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {

        /*
        WebElement radiobutton1 = browser.findElement(By.cssSelector("input[value='radio1']"));
        radiobutton1.click();
        Thread.sleep(5000);

        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        selectDropdown.click();
        Thread.sleep(5000);
         */

        //Classname
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement text = browser.findElement(By.cssSelector(".ui-autocomplete-input"));
        text.sendKeys("locate using cssSelector");
        Thread.sleep(3000);

        browser.get("https://trytestingthis.netlify.app/");
        //Tagname
        System.out.println(browser.findElement(By.xpath("//h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("h1")).getText());

        //Id
        WebElement firstName = browser.findElement(By.xpath("//*[@id='fname']"));
        firstName.sendKeys("Redwan by xpath");
        Thread.sleep(3000);
        firstName.clear();
        firstName = browser.findElement(By.cssSelector("#fname"));
        firstName.sendKeys("Redwan by cssSelector");
        Thread.sleep(3000);

        // Child locate
        System.out.println(browser.findElement(By.xpath("//div /h1")).getText());
        System.out.println(browser.findElement(By.cssSelector("div > h1")).getText());

        // Multiple attribute
        System.out.println(browser.findElement(By.xpath("//a[@class='button bar-item' and @href='/']")).getText());
        System.out.println(browser.findElement(By.cssSelector("a[class='button bar-item'][href='/']")).getText());

        // using SubString
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick,\" window.open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick^=\" window.open('http://google.com',\"]")).getText());

        // Content Method (match any part in the content)
        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick,\"open('http://google.com',\")]")).getText());
        System.out.println(browser.findElement(By.cssSelector("button[onclick*=\"open('http://google.com',\"]")).getText());

        // Table child locate
        System.out.println(browser.findElement(By.xpath("//tr /th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());

        System.out.println(browser.findElement(By.cssSelector("tr > th:first-child")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(3)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:last-child")).getText());

        // siblings locate
        System.out.println(browser.findElement(By.xpath("//td[text()='Personal Shopper']")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'rsonal Sh')]")).getText());

        // content method + previous or next sibling locate
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /preceding-sibling::td")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /following-sibling::td[2]")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /following-sibling::td[last()]")).getText());








    }
}
