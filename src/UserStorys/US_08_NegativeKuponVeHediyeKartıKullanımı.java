package UserStorys;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US_08_NegativeKuponVeHediyeKartıKullanımı extends BaseDriver {

        @Test
        public void Test() {
            driver.get("https://demowebshop.tricentis.com/login");
            WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
            login.click();

            WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
            email.sendKeys("javanator@gmail.com");

            WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
            password.sendKeys("Pass1234");

            WebElement log = driver.findElement(By.xpath("//input[@value='Log in']"));
            log.click();

            WebElement computersCategory = driver.findElement(By.linkText("Computers"));
            computersCategory.click();


            WebElement notebooksOption = driver.findElement(By.linkText("Notebooks"));
            notebooksOption.click();


            WebElement laptopAddToCartButton = driver.findElement(By.cssSelector("input[value='Add to cart']"));
            laptopAddToCartButton.click();


            WebElement addToCartMessage = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
            wait.until(ExpectedConditions.visibilityOf(addToCartMessage));
            Assert.assertTrue("Ürün sepete eklenemedi", addToCartMessage.isDisplayed());

            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shoppingCartButton = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
            //shoppingCartButton.click();
            js.executeScript("arguments[0].click();", shoppingCartButton);

            WebElement applyCouponButton = driver.findElement(By.name("applydiscountcouponcode"));
            applyCouponButton.click();

            WebElement couponErrorMessage = driver.findElement(By.xpath("//div[@class='message']"));
            wait.until(ExpectedConditions.visibilityOf(couponErrorMessage));
            Assert.assertFalse("Kupon uygulanamadı", couponErrorMessage.getText().contains("The coupon code you entered couldn't be applied to your order."));


            WebElement addGiftCardButton = driver.findElement(By.name("applygiftcardcouponcode"));
            addGiftCardButton.click();

            WebElement giftCardErrorMessage = driver.findElement(By.xpath("//div[@class='message']"));
            wait.until(ExpectedConditions.visibilityOf(giftCardErrorMessage));
            Assert.assertTrue("Hediye kartı uygulanamadı", giftCardErrorMessage.getText().contains("The coupon code you entered couldn't be applied to your order"));



            WebElement countryDropdown = driver.findElement(By.id("CountryId"));
            Select ccdMenu=new Select(countryDropdown);
            ccdMenu.selectByVisibleText("Turkey");


            WebElement codeInput = driver.findElement(By.id("ZipPostalCode"));
            codeInput.sendKeys("09400");


            WebElement termsCheckbox = driver.findElement(By.id("termsofservice"));
            termsCheckbox.click();

            WebElement checkoutButton = driver.findElement(By.cssSelector("button[id='checkout']"));
            checkoutButton.click();



            BekleKapat();
        }
}



