package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public class GetScoreIfNamesFirstCharAreConsonant implements NamesScoreGetter {
    @Override
    public Integer getScore(Name firstName, Name secondName) {
        return firstName.isFirstnameConsonant() && secondName.isFirstnameConsonant() ? 10 : 0;
    }
}
