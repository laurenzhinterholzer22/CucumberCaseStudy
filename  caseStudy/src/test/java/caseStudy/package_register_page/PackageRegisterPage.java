package caseStudy.package_register_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PackageRegisterPage {

    @FindBy(id = "register_new_package")
    WebElement btn_register_new_package;

    WebDriver driver;

    public PackageRegisterPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkForInvalidLength () {
        return !driver.getPageSource().contains("Length of the Package must be between 10 and 190 cm");
    }

    public boolean checkForInvalidBroad () {
        return !driver.getPageSource().contains("Broad of the Package must be between 10 and 130 cm");
    }

    public boolean checkForInvalidHeight() {
        return !driver.getPageSource().contains("Height of the Package must be between 5 and 90 cm");
    }

    public boolean checkForInvalidWeight () {
        return !driver.getPageSource().contains("Weight of the Package must be between 1 and 50 kg");
    }

    public boolean checkForInvalidSendersLocation () {
        return !driver.getPageSource().contains("Packages can only be sent from Austria, Germany or Switzerland");
    }

    public boolean checkForInvalidReceiversLocation () {
        return !driver.getPageSource().contains("Packages can only be sent to Austria, Germany or Switzerland");
    }

    public boolean checkForInvalidGirth() {
        return !driver.getPageSource().contains("Girth of the Package must be under 390 cm");
    }

    public boolean checkForCorrectCalculation (String price) {
        return driver.getPageSource().contains("The Price of the Package is: " + price);
    }

    public void checkForValidRegistration () {
        btn_register_new_package.isDisplayed();
    }

    public void clickRegisterNewPackage () {
        btn_register_new_package.click();
    }




}
