package UserStorys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_02_NegativeRegisterUser extends BaseDriver {
    @Test
    public void NegativeRegisterUser(){
        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement register= driver.findElement(By.linkText("Register"));
        register.click();

        WebElement inputGender= driver.findElement(By.id("gender-female"));
        inputGender.click();

        WebElement inputFirstname= driver.findElement(By.id("FirstName"));
        inputFirstname.sendKeys("Team");

        WebElement inputLastname= driver.findElement(By.id("LastName"));
        inputLastname.sendKeys("Javanator");

        WebElement inputEmail= driver.findElement(By.id("Email"));
        inputEmail.sendKeys("javanator@gmail.com");

        WebElement inputPassword= driver.findElement(By.id("Password"));
        inputPassword.sendKeys("Pass1234");

        WebElement inputConfirmPassword= driver.findElement(By.id("ConfirmPassword"));
        inputConfirmPassword.sendKeys("Pass1234");

        WebElement btnRegister= driver.findElement(By.id("register-button"));
        btnRegister.click();


        WebElement msg= driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
        wait.until(ExpectedConditions.visibilityOf(msg));
        Assert.assertTrue("Mesaj bulunamadı",msg.getText().contains("The specified email already exists"));


        BekleKapat();









    }

}
