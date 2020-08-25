package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class logoCheckSteps {

    WebDriver  driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        System.setProperty("webdriver.chrome.driver","C://Users//bhara//OneDrive//Desktop//New folder//WorkingDirectory//Drivers//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I launch the application")
    public void i_launch_the_application() {
        driver.get("http://demo.automationtesting.in/Register.html");

    }

    @Then("I verify the logo present on the screen")
    public void i_verify_the_logo_present_on_the_screen() {
        boolean status = driver.findElement(By.id("imagetrgt")).isDisplayed();
        Assert.assertEquals(true,status);

    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}


