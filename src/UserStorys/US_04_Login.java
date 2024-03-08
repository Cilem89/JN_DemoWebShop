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

public class US_04_Login extends BaseDriver {

    @Test
    public void Login(){
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement login= driver.findElement(By.xpath("//a[text()='Log in']"));
        Actions actions=new Actions(driver);

        Action loginButton=actions.moveToElement(login).click().build();
        actions.perform();

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("javanator@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Pass1234");

        WebElement log=driver.findElement(By.xpath("//input[@value='Log in']"));
        log.click();

        WebElement anaSayfa=driver.findElement(By.xpath("//a[@href='/books']"));


        wait.until(ExpectedConditions.textToBe(By.xpath("//strong[text()='Categories']"), "CATEGORIES"));
        WebElement mesaj=driver.findElement(By.xpath("//strong[text()='Categories']"));

        Assert.assertTrue("Aranılan mesaj bulunamadı",  mesaj.getText().equals("CATEGORIES") );

        BekleKapat();





    }
}
