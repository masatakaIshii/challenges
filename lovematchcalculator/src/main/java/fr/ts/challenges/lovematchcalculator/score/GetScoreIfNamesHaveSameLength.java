package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public class GetScoreIfNamesHaveSameLength implements NamesScoreGetter {
    @Override
    public Integer getScore(Name firstName, Name secondName) {
        return firstName.hasSameLengthThan(secondName) ? 20 : 0;
    }
}
