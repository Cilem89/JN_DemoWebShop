package UserStorys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_03_LogOut extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("javanator@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Pass1234");
        MyFunc.Bekle(2);

        WebElement login2= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(2);

        WebElement isimdogrulama=driver.findElement(By.xpath("//a[@href='/customer/info']"));
        Assert.assertTrue("Login basarisiz",isimdogrulama.getText().toLowerCase().contains("javanator"));
        MyFunc.Bekle(2);

        WebElement logout= driver.findElement(By.xpath("//a[@href='/logout']"));
        logout.click();
        MyFunc.Bekle(2);

        WebElement cikisdogrulama=driver.findElement(By.xpath("//a[@href='/register']"));
        Assert.assertTrue("Cikis basarisiz",cikisdogrulama.getText().toLowerCase().contains("register"));
        MyFunc.Bekle(2);


        BekleKapat();
    }








}
