package caseStudy.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "length")
    WebElement txt_length;

    @FindBy(id = "broad")
    WebElement txt_broad;

    @FindBy(id = "height")
    WebElement txt_height;

    @FindBy(id = "weight")
    WebElement txt_weight;

    @FindBy(id = "senders_location")
    WebElement txt_senders_location;

    @FindBy(id = "receivers_location")
    WebElement text_receivers_location;

    @FindBy(id = "register_package")
    WebElement btn_register_package;

    WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLength (String length) {txt_length.sendKeys(length);}

    public void enterBroad (String broad) {txt_broad.sendKeys(broad);}

    public void enterHeight (String height) {txt_height.sendKeys(height);}

    public void enterWeight (String weight) {txt_weight.sendKeys(weight);}

    public void enterSendersLocation (String senders_location) {txt_senders_location.sendKeys(senders_location);}

    public void enterReceiversLocation(String receivers_location) {text_receivers_location.sendKeys(receivers_location);}

    public void checkValidLogin () {btn_register_package.isDisplayed();}

    public void clickRegisterPackage () {btn_register_package.click();}





}
