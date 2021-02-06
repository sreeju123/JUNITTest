package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    private static WebElement element = null;

    public static WebElement Field_Username(WebDriver driver) {
        try{
            element = driver.findElement(By.id("email--1"));
        }catch(NoSuchElementException e) {
            Assert.fail("Element Not Found as this button may not have been developed yet.");
        }
        return element;
    }
    public static WebElement Field_Password(WebDriver driver) {
        try{
            element = driver.findElement(By.id("id_password"));
        }catch(NoSuchElementException e) {
            Assert.fail("Element Not Found as this button may not have been developed yet.");
        }
        return element;
    }
    public static WebElement Button_Submit(WebDriver driver) {
        try{
            element = driver.findElement(By.id("register-btn"));
        }catch(NoSuchElementException e) {
            Assert.fail("Element Not Found as this button may not have been developed yet.");
        }
        return element;
    }

    public static WebElement Error_Login(WebDriver driver) {
        try{
            element = driver.findElement(By.xpath("//*[@id='login-form']/div[1]/div/div"));
        }catch(NoSuchElementException e) {
            Assert.fail("Element Not Found as this button may not have been developed yet.");
        }
        return element;
    }
}
