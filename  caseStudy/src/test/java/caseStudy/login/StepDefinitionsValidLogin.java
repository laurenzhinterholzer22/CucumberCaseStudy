package caseStudy.login;

import caseStudy.browser.Browser;
import caseStudy.homepage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitionsValidLogin {

//    WebDriver driver = null;
//    LoginPage loginPage;
//    HomePage homePage;
//
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver",projectPath +  "/src/test/resources/caseStudy/drivers/chromedriver");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//    }
//    @Given("user is on login page")
//    public void user_is_on_login_page() {
//        driver.navigate().to("http://localhost/cucumber/index.php");
//    }
//
//    // regex expression is necessary, the (.*) allows everything
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password (String username, String password) throws InterruptedException {
//        loginPage = new LoginPage(driver);
//        loginPage.enterUsername(username);
//        loginPage.enterPassword(password);
//        Thread.sleep(1000);
//    }
//    @When("user clicks on login button")
//    public void user_clicks_on_login_button() {
//        loginPage.clickLogin();
//    }
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() throws InterruptedException {
//        homePage = new HomePage(driver);
//        homePage.checkValidLogin();
//        Thread.sleep(1000);
//        driver.close();
//        driver.quit();
//    }
}
