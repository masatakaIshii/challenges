package fr.ts.challenges.lovematchcalculator;

import java.util.regex.Pattern;

public class Calculator {
    public Integer calculate(String firstNameStr, String secondNameStr) {
        var result = 0;
        var firstName = new Name(firstNameStr);
        var secondName = new Name(secondNameStr);

        if (firstName.hasSameLengthThan(secondName)) {
            result += 20;
        }
        if (firstName.isFirstNameVowel() && secondName.isFirstNameVowel()) {
            result += 10;
        }
        if (firstName.isFirstnameConsonant() && secondName.isFirstnameConsonant()) {
            result += 10;
        }
        if (firstName.numberOfVowels() == secondName.numberOfVowels()) {
            result += 12;
        }
        if (firstName.numberOfConsonants() == secondName.numberOfConsonants()) {
            result += 12;
        }
        if (firstName.containsAtLeastLove() && secondName.containsAtLeastLove()) {
            result += 7;
        }
        return result;
    }
}
