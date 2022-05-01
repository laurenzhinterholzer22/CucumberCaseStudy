package caseStudy.rule;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsExampleRule {

    @Given("today is {double}.{int}")
    public void today_is(Double double1, Integer int1) {
    }

    @When("user is registering a package")
    public void user_is_registering_a_package() {
    }

    @Then("user should get a discount of {int}€")
    public void user_should_get_a_discount_of_€(Integer int1) {
    }

    @Then("user should not get a discount")
    public void user_should_not_get_a_discount() {
    }

}
