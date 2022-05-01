package caseStudy.homepage;

import caseStudy.package_register_page.PackageRegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitionsValidPackageValues {

    WebDriver driver = null;
    HomePage homePage;
    PackageRegisterPage packageRegisterPage;

    // -------------------------------------------------------------------------------------------
    // Background
    // -------------------------------------------------------------------------------------------

    @Given ("browser is open")
    public void browser_is_open() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath +  "/src/test/resources/caseStudy/drivers/chromedriver");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Given("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        driver.navigate().to("http://localhost/cucumber/homepage.php");
    }

    // -------------------------------------------------------------------------------------------
    // Entering Values
    // -------------------------------------------------------------------------------------------

    @When("^user enters length (.*)$")
    public void user_enters_length(String length) {
        homePage = new HomePage(driver);
        homePage.enterLength(length);
    }

    @When("^user enters broad (.*)$")
    public void user_enters_broad(String broad) {
        homePage = new HomePage(driver);
        homePage.enterBroad(broad);
    }

    @When("^user enters height (.*)$")
    public void user_enters_height(String height) {
        homePage = new HomePage(driver);
        homePage.enterHeight(height);
    }

    @When("^user enters weight (.*)$")
    public void user_enters_weight(String weight) {
        homePage = new HomePage(driver);
        homePage.enterWeight(weight);
    }

    @When("^user enters senders location (.*)$")
    public void user_enters_senders_location(String senders_location) {
        homePage = new HomePage(driver);
        homePage.enterSendersLocation(senders_location);
    }

    @When("^user enters receivers location (.*)$")
    public void user_enters_receivers_location(String receivers_location) {
        homePage = new HomePage(driver);
        homePage.enterReceiversLocation(receivers_location);
    }


    // -------------------------------------------------------------------------------------------
    // Clicks on register package && Package Register Page
    // -------------------------------------------------------------------------------------------

    @When("clicks on register package")
    public void clicks_on_register_package() {
        homePage.clickRegisterPackage();
    }

    @Then("user is navigated to the package-register page")
    public void user_is_navigated_to_the_package_register_page() {
        packageRegisterPage = new PackageRegisterPage(driver);
        packageRegisterPage.checkForValidRegistration();
    }

    // -------------------------------------------------------------------------------------------
    // Checking if error message isn't shown
    // -------------------------------------------------------------------------------------------


    @Then("no error regarding the length should be shown")
    public void no_error_regarding_the_length_should_be_shown() {
        assertTrue(packageRegisterPage.checkForInvalidLength());
        driver.close();
        driver.quit();
    }

    @Then("no error regarding the broad should be shown")
    public void no_error_regarding_the_broad_should_be_shown() {
        assertTrue(packageRegisterPage.checkForInvalidBroad());
        driver.close();
        driver.quit();
    }

    @Then("no error regarding the height should be shown")
    public void no_error_regarding_the_height_should_be_shown() {
       assertTrue(packageRegisterPage.checkForInvalidHeight());
        driver.close();
        driver.quit();
    }

    @Then("no error regarding the weight should be shown")
    public void no_error_regarding_the_weight_should_be_shown() {
        assertTrue(packageRegisterPage.checkForInvalidWeight());
        driver.close();
        driver.quit();
    }

    @Then("no error regarding the senders location should be shown")
    public void no_error_regarding_the_senders_location_should_be_shown() {
        assertTrue(packageRegisterPage.checkForInvalidSendersLocation());
        driver.close();
        driver.quit();
    }

    @Then("no error regarding the receivers location should be shown")
    public void no_error_regarding_the_receivers_location_should_be_shown() {
        assertTrue(packageRegisterPage.checkForInvalidReceiversLocation());
        driver.close();
        driver.quit();
    }

}
