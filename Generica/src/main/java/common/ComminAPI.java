package common;

import jdk.jfr.StackTrace;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ComminAPI {


    public static WebDriver driver = null;

    @Parameters({url})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE ENGINEERING\\PROJECTS\\IdeaProjects\\PNT\\HomeworkWebAutomationJuly2019\\Generic\\browser-driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }



    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}








