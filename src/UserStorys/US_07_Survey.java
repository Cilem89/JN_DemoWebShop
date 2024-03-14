package UserStorys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;


public class US_07_Survey extends BaseDriver {

    @Test
    public void Survey(){
        driver.get("https://demowebshop.tricentis.com/login");

        Actions actions=new Actions(driver);

        WebElement login= driver.findElement(By.xpath("//a[text()='Log in']"));
        actions.moveToElement(login).click().perform();


        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        actions.moveToElement(email).sendKeys("javanator@gmail.com").perform();

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        //actions.moveToElement(password).sendKeys("Pass1234").perform();
        password.sendKeys("Pass1234");

        WebElement log=driver.findElement(By.xpath("//input[@value='Log in']"));
        actions.moveToElement(log).click().perform();



        WebElement anaSayfa=driver.findElement(By.xpath("//strong[text()='Community poll']"));

        WebElement excellent=driver.findElement(By.xpath("//ul[@class='poll-results']/li"));
        excellent.isDisplayed();
        WebElement good=driver.findElement(By.cssSelector("[class='poll-results']>li+li"));
        good.isDisplayed();

        WebElement poor=driver.findElement(By.cssSelector("[class='poll-results']>li+li+li"));
        poor.isSelected();

        WebElement veryBad=driver.findElement(By.cssSelector("[class='poll-results']>li+li+li+li"));
        veryBad.isSelected();

        BekleKapat();
    }
}
