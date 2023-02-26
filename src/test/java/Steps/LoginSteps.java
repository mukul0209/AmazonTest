package Steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LoginSteps {
    public static WebDriver driver;

    @Given("^User is on amazon login page$")
    public void user_is_on_amazon_login_page(){
        System.setProperty("webdriver.chrome.driver", "/Users/mukulsharma/Downloads/chromedriver_mac64/chromedriver");
        //Initializing ChromeOptions Object
        ChromeOptions options = new ChromeOptions();
        //Setting path of brave browser
        options.setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.in/");

    }
    @When("^Title of webpage is Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in$")
    public void title_of_webpage_is_online_shopping_site_in_india(){
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Title of webpage is Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @Then("^User hovers cursor on Hello, sign in$")
    public void user_hovers_cursor_on_Hello_sign_in (){
        WebElement main_element = driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));

        //Creating object of an Action class
        Actions action = new Actions(driver);


        //Performing the mouse hover action on target element
        action.moveToElement(main_element).perform();
    }

    @And("^User clicks on Signin$")
    public void user_clicks_on_signin () {
        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();

    }





}