package caseStudy.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

class IsSendersLocationValid {
    static String isSendersLocationValid(String senders_location) {
        if (senders_location.equals("Austria") || senders_location.equals("Switzerland") ||senders_location.equals("Germany")) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

}

public class StepDefinitionsSendersLocation {
    private String senders_location;
    private String actualAnswer;

    @Given("senders location is {string}")
    public void senders_location_is(String senders_location) {
        this.senders_location = senders_location;
    }

    @When("I send the package")
    public void i_send_the_package() {
        actualAnswer = IsSendersLocationValid.isSendersLocationValid(senders_location);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}
