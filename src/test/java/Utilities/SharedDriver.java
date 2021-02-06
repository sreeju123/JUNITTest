package Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.HashMap;

public class SharedDriver  {
    static String browser = "chrome";
    public static boolean headless = Boolean.parseBoolean(System.getProperty("browser.headless", "false"));
    protected WebDriver driver;



    @BeforeTest
    public void setBrowser() {
        switch (browser){
            case "chrome":
                driver = new ChromeDriver(setChrome());
                break;
            default:
                driver= new ChromeDriver(setChrome());
                break;
        }
    }

    public static ChromeOptions setChrome(){
        ChromeOptions chromeOptions = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "c:\\Downloads");
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        chromeOptions.setHeadless(headless);
        chromeOptions.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
        return chromeOptions;
    }

}
