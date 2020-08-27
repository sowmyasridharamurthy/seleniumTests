package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;



public class basePage {
    private static WebElement element =null;

    public static WebElement home(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[text()='Home']"));
        return element;
    }

    public static WebElement practice(WebDriver driver){
       element =  driver.findElement(By.xpath("//a[contains(text()='Video')]"));

        return element;
    }

    public static WebElement logo(WebDriver driver){
        element =  driver.findElement(By.id("imagetrgt"));
        return element;
    }

    public static WebElement signInBtn(WebDriver driver){
        element =  driver.findElement(By.id("btn1"));
        return element;
    }

    public static WebElement skipSignIn(WebDriver driver){
        element =  driver.findElement(By.id("btn2"));
        return element;
    }
    public static WebElement shopBtn(WebDriver driver){
        element =  driver.findElement(By.id("menu-item-40"));
        return element;
    }


}
