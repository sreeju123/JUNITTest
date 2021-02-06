package Steps;

import Pages.LoginPage;
import Utilities.SharedDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login extends SharedDriver{



//    static String browser = "chrome";

//    @Before
//    public  void setBrowser() {
//        switch (browser){
//            case "firefox":
////                return new FirefoxDriver();
//            case "ie":
////                return new InternetExplorerDriver();
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver","D:\\Projects\\Driver\\chromedriver.exe");
//                driver=new ChromeDriver();
//        }
//    }

    @Test
    public void getURL(){
//        SharedDriver.setBrowser();
        driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }

    @Test
    public void enter_UsernamePassword(){
//        LoginPage.Field_Username(driver).sendKeys("dfds");
//        LoginPage.Field_Password(driver).sendKeys("sdfsd");
        driver.findElement(By.name("firstName")).sendKeys("Sreejith");
    }

    @Test
    public void clickLogin(){
        LoginPage.Button_Submit(driver).click();
    }

    @Test
    public void verifyLoginError(){
        driver.findElement(By.id("register-confirm")).getText().equals("Registration Confirmation Page");
    }

}
