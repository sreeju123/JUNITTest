package Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Simple {

    @Test
    public void verify(){
        System.setProperty("webdriver.chrome.driver","D:\\Projects\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2F&response_type=html");

    }
}
