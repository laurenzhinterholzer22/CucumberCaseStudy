package caseStudy.homepage;

import caseStudy.package_register_page.PackageRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitionsValidCostCalculation {

//    WebDriver driver = null;
//    HomePage homePage;
//    PackageRegisterPage packageRegisterPage;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver",projectPath +  "/src/test/resources/caseStudy/drivers/chromedriver");
//        driver = new ChromeDriver();
//
//    }
//    @Given("user is navigated to homepage")
//    public void user_is_navigated_to_homepage() {
//        driver.navigate().to("http://localhost/cucumber/homepage.php");
//    }
//    @And("^user enters length (.*)$")
//    public void user_enters_length(String length) {
//        homePage = new HomePage(driver);
//        homePage.enterLength(length);
//    }
//    @And("^user enters broad (.*)$")
//    public void user_enters_broad(String broad) {
//        homePage.enterBroad(broad);
//    }
//    @And("^user enters height (.*)$")
//    public void user_enters_height(String height) {
//        homePage.enterHeight(height);
//    }
//
//    @And("^user enters weight (.*)$")
//    public void user_enters_weight(String weight) {
//        homePage.enterWeight(weight);
//    }
//    @And("^user enters senders location (.*)$")
//    public void user_enters_senders_location(String senders_location) {
//        homePage.enterSendersLocation(senders_location);
//    }
//    @And("^user enters receivers location (.*)$")
//    public void user_enters_receivers_location(String receivers_location) {
//        homePage.enterReceiversLocation(receivers_location);
//    }
//    @When("user clicks on register package")
//    public void user_clicks_on_register_package() {
//        homePage.clickRegisterPackage();
//    }
//    @Then("user is navigated to the package-register page")
//    public void user_is_navigated_to_the_package_register_page() {
//        packageRegisterPage = new PackageRegisterPage(driver);
//        packageRegisterPage.checkForValidRegistration();
//    }
//    @Then("^the price (.*) of the shipping of the package should be shown$")
//    public void the_price_of_the_shipping_of_the_package_should_be_shown(String price) {
//        assertTrue(packageRegisterPage.checkForCorrectCalculation(price));
//        driver.close();
//        driver.quit();
//    }
}
