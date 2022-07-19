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
                new GetScoreIfNamesHaveSameNumberVowels(),
                new GetScoreIfNamesHaveSameNumberConsonants(),
                new GetScoreWhenBothNamesContainsAtLeastLove()
        );
    }

    public Integer calculate(String firstNameStr, String secondNameStr) {
        var firstName = new Name(firstNameStr);
        var secondName = new Name(secondNameStr);

        return scoreGetters
                .stream()
                .reduce(0,
                        (currentScore, scoreGetter) ->
                                currentScore + scoreGetter.getScore(firstName, secondName),
                        Integer::sum
                );
    }
}
