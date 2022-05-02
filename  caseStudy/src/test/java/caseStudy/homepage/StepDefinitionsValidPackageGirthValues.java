package caseStudy.homepage;

import caseStudy.package_register_page.PackageRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitionsValidPackageGirthValues {

    WebDriver driver = null;
    HomePage homePage;
    PackageRegisterPage packageRegisterPage;

    @Given("browser is open")
    public void browser_is_open() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath +  "/src/test/resources/caseStudy/drivers/chromedriver");
        driver = new ChromeDriver();

    }
    @Given("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        driver.navigate().to("http://localhost/cucumber/homepage.php");
    }
    @Given("^user enters length (.*)$")
    public void user_enters_length(String length) {
        homePage = new HomePage(driver);
        homePage.enterLength(length);
    }
    @Given("^user enters broad (.*)$")
    public void user_enters_broad(String broad) {
        homePage.enterBroad(broad);
    }
    @Given("^user enters height (.*)$")
    public void user_enters_height(String height) {
        homePage.enterHeight(height);
    }
    @When("user clicks on register package")
    public void user_clicks_on_register_package() {
        homePage.clickRegisterPackage();
    }
    @Then("user is navigated to the package-register page")
    public void user_is_navigated_to_the_package_register_page() {
        packageRegisterPage = new PackageRegisterPage(driver);
        packageRegisterPage.checkForValidRegistration();
    }
    @Then("no error regarding the girth should be shown")
    public void no_error_regarding_the_girth_should_be_shown() {
       assertTrue(packageRegisterPage.checkForInvalidGirth());
        driver.close();
        driver.quit();
    }

}
