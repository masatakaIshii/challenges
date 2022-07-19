package fr.ts.challenges.lovematchcalculator;

import fr.ts.challenges.lovematchcalculator.score.GetScoreIfNamesFirstCharAreVowels;
import fr.ts.challenges.lovematchcalculator.score.GetScoreIfNamesHaveSameLength;
import fr.ts.challenges.lovematchcalculator.score.NamesScoreGetter;

import java.util.List;

public class Calculator {
    private final List<NamesScoreGetter> scoreGetters;

    public Calculator() {
        scoreGetters = List.of(
                new GetScoreIfNamesHaveSameLength(),
                new GetScoreIfNamesFirstCharAreVowels()
        );
    }

    public Integer calculate(String firstNameStr, String secondNameStr) {
        var result = 0;
        var firstName = new Name(firstNameStr);
        var secondName = new Name(secondNameStr);

        result += scoreGetters.stream()
                .reduce(0, (partialResult, scoreGetter) -> partialResult + scoreGetter.getScore(firstName, secondName), Integer::sum);

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
