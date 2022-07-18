package fr.ts.challenges.lovematchcalculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculateStep {
    private final CalculatorContainer calculatorContainer;

    public CalculateStep(CalculatorContainer calculatorContainer) {
        this.calculatorContainer = calculatorContainer;
    }


    @Given("Two names {string} and {string}")
    public void twoNamesFirstNameAndSecondName(String firstName, String secondName) {
        calculatorContainer.setFirstName(firstName);
        calculatorContainer.setSecondName(secondName);
    }

    @When("Calculate love match score")
    public void calculateLoveMatchScore() {
        calculatorContainer.calculateScore();
    }

    @Then("The score is {int}")
    public void theScoreIsScore(Integer score) {
        assertThat(calculatorContainer.getScore()).isNotNull();
        assertThat(calculatorContainer.getScore()).isEqualTo(score);
    }
}
