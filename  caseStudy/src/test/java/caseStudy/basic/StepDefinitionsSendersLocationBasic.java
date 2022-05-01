package caseStudy.basic;

import caseStudy.basic.IsSendersLocationValid;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsSendersLocationValidBasic {
    static String isSendersLocationValid(String senders_location) {
        if (senders_location.equals("Austria") || senders_location.equals("Switzerland") ||senders_location.equals("Germany")) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

}

public class StepDefinitionsSendersLocationBasic {

    private String senders_location;
    private String actualAnswer;

    @Given("senders location is Austria")
    public void senders_location_is_austria() {
        this.senders_location = "Austria";
    }

    @Given("senders location is Hungary")
    public void senders_location_is_hungary() {
        this.senders_location = "Hungary";
    }

    @When("I send the austrian package")
    public void i_send_the_austrian_package() {
        actualAnswer = IsSendersLocationValid.isSendersLocationValid(senders_location);
    }

    @When("I send the hungarian package")
    public void i_send_the_hungarian_package() {
        actualAnswer = IsSendersLocationValid.isSendersLocationValid(senders_location);
    }

    @Then("I should be told Yes")
    public void i_should_be_told_yes() {
        assertEquals("Yes", actualAnswer);
    }

    @Then("I should be told No")
    public void i_should_be_told_no() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("No", actualAnswer);
    }
}
