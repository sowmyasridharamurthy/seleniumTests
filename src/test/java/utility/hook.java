package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hook {

    private static WebDriver driver;
    @Before
    public static void setUp(){

    System.setProperty("webdriver.chrome.driver","C://Users//bhara//OneDrive//Desktop//New folder//WorkingDirectory//Drivers//chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        System.out.println("I AM INSIDE HOOKS CLASS");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){

        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
