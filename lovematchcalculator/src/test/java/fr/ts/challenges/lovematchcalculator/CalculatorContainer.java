package fr.ts.challenges.lovematchcalculator;

public class CalculatorContainer {
    private final Calculator calculator;
    private String firstName;
    private String secondName;

    private Integer result;

    public CalculatorContainer(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void calculateScore() {
        this.result = calculator.calculate(this.firstName, this.secondName);
    }

    public Integer getScore() {
        return this.result;
    }
}
