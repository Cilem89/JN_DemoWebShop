package US;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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








    }

}
