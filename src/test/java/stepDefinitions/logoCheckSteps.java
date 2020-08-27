package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.hook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.basePage;

public  class logoCheckSteps {

    private  WebDriver driver;
    public logoCheckSteps(){
    this.driver = hook.getDriver();

    }

    @Given("I launch the browser")
    public void i_launch_the_browser() {
      //  System.setProperty("webdriver.chrome.driver","C://Users//bhara//OneDrive//Desktop//New folder//WorkingDirectory//Drivers//chromedriver_win32/chromedriver.exe");
      //  driver = new ChromeDriver();
    }

    @When("I launch the application")
    public void i_launch_the_application() {
   //   driver.get("http://demo.automationtesting.in/Register.html");

    }

    @Given("I am already in application")
    public void i_am_already_in_application() {

    }

    @Then("I verify the logo present on the screen")
    public void i_verify_the_logo_present_on_the_screen() {
        WebElement logo = basePage.logo(driver);
        boolean status = logo.isDisplayed();
        Assert.assertEquals(true,status);

    }


    @When("I click on Home page")
    public void i_click_on_home_page() {
     WebElement homeBtn = basePage.home(driver);
     homeBtn.click();

    }

    @Then("Sign and skip sign in buttons to be displayed")
    public void sign_and_skip_sign_in_buttons_to_be_displayed() {
        WebElement signIn = basePage.signInBtn(driver);
        WebElement skipSign = basePage.skipSignIn(driver);
        boolean signInBtn  = signIn.isDisplayed();
        boolean skipSignInBtn = skipSign.isDisplayed();
        Assert.assertEquals(true ,signInBtn);
        Assert.assertEquals(true, skipSignInBtn);


    }


}


