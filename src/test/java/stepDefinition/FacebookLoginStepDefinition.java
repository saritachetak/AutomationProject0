package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginStepDefinition {

   public static WebDriver driver;
    @Before
    public void setUp(){
        System.out.println("launch chrome");
        System.out.println("enter the  facebook URL ");
    }
    @After
    public void tearDown(){
        System.out.println("close the browser");
        driver.quit();
    }
    @Given("^i am a facebook user$")
    public void i_am_a_facebook_user() {
        System.out.println("i am a facebook user");
        System.setProperty("webdriver.chrome.driver", "C://Users//Chetakrao//IdeaProjects//AutomationPractice2//src//test//java//chromedriver.exe");
        driver=new ChromeDriver();   ///launch the chrome browser
        driver.get("https://www.facebook.com");
    }

    @When("^user enter the username and password$")
    public void user_enter_the_username_and_password()  {
        System.out.println("user enter the username and password");
        driver.findElement(By.id("email")).sendKeys("abcd");
        driver.findElement(By.id("pass")).sendKeys("abcdefghijk");
        //driver.findElement(By.id("loginbutton")).click();

    }
    @When("^user click the login button$")
    public void user_click_the_login_button()  {
        System.out.println(" click the login button");
        driver.findElement(By.id("loginbutton")).click();


    }

    @Then("^user login the facebook$")
    public void user_login_the_facebook()  {
        System.out.println("user login the facebook");

    }


    @When("^i enter the first name and surname$")
    public void i_enter_the_first_name_and_surname()  {
        System.out.println("enter the fist name and  surname");

    }

    @When("^enter the email address and new password$")
    public void enter_the_email_address_and_new_password()
    {
        System.out.println("enter the email address and password");


    }

    @When("^enter the dob and gender$")
    public void enter_the_dob_and_gender()
    {
        System.out.println("enter the dob and gender");


    }

    @Then("^user create a new facebook profile$")
    public void user_create_a_new_facebook_profile()
    {
        System.out.println(" user create a new facebook");

    }
    @When("^user enter the invalid username and password$")
    public void user_enter_the_invalid_username_and_password()  {
        System.out.println("user enter the invalid username and password");


    }

    @Then("^user not success the login$")
    public void user_not_success_the_login()  {
        System.out.println("user not success the login page");


    }



}



