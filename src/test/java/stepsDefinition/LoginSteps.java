package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    // Initialize driver and page objects before scenario
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.open();
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmit();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        String expectedText = "Logged In Successfully";
        String actualText = homePage.getHeaderText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "User is not on the home page");
    }

    @Given("user is logged in")
    public void user_is_logged_in() {
        loginPage.login("student", "Password123");
    }

    @When("user logs out")
    public void user_logs_out() {
        homePage.clickLogout();
    }

    @Then("user is on login page after logout")
    public void user_is_on_login_page_after_logout() {
        Assert.assertTrue(loginPage.isOnLoginPage(), "User is not on the login page after logout");
    }
}
