package fr.ts.challenges.lovematchcalculator;

import fr.ts.challenges.lovematchcalculator.score.*;

import java.util.List;

public class Calculator {
    private final List<NamesScoreGetter> scoreGetters;

    public Calculator() {
        scoreGetters = List.of(
                new GetScoreIfNamesHaveSameLength(),
                new GetScoreIfNamesFirstCharAreVowels(),
                new GetScoreIfNamesFirstCharAreConsonant(),
                new GetScoreIfNamesHaveSameNumberVowels()
        );
    }

    public Integer calculate(String firstNameStr, String secondNameStr) {
        var result = 0;
        var firstName = new Name(firstNameStr);
        var secondName = new Name(secondNameStr);

        result += scoreGetters.stream()
                .reduce(0, (partialResult, scoreGetter) -> partialResult + scoreGetter.getScore(firstName, secondName), Integer::sum);

        if (firstName.numberOfConsonants() == secondName.numberOfConsonants()) {
            result += 12;
        }
        if (firstName.containsAtLeastLove() && secondName.containsAtLeastLove()) {
            result += 7;
        }
        return result;
    }
}
