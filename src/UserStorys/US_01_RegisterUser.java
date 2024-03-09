package UserStorys;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_01_RegisterUser extends BaseDriver {

    @Test
    public void RegisterUser(){
        driver.get(" https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement register= driver.findElement(By.linkText("Register"));
        register.click();

        WebElement inputGender=driver.findElement(By.id("gender-female"));
        inputGender.click();

        WebElement inputFirstName=driver.findElement(By.id("FirstName"));
        inputFirstName.sendKeys("Team");

        WebElement inputLastName= driver.findElement(By.id("LastName"));
        inputLastName.sendKeys("Javanator");

        WebElement inputEmail=driver.findElement(By.id("Email"));
        inputEmail.sendKeys("javanator@gmail.com");

        WebElement inputPassword=driver.findElement(By.id("Password"));
        inputPassword.sendKeys("Pass123");

        WebElement inputPassword2=driver.findElement(By.id("ConfirmPassword"));
        inputPassword2.sendKeys("Pass123");

        WebElement registerBtn= driver.findElement(By.id("register-button"));
        registerBtn.click();

        BekleKapat();

    }
}
