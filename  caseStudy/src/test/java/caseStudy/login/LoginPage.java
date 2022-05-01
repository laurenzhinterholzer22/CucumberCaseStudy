package caseStudy.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user")
    WebElement txt_username;

    @FindBy(id = "pass")
    WebElement txt_password;

    @FindBy(id = "login")
    WebElement btn_login;

    @FindBy(id = "register_package")
    WebElement btn_register_package;

    WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        // to initialise all the @FindBy Elements
        PageFactory.initElements(driver, this);
    }

    public void enterUsername (String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword (String password) {
        txt_password.sendKeys(password);
    }

    public void clickLogin () {
        btn_login.click();
    }












}
