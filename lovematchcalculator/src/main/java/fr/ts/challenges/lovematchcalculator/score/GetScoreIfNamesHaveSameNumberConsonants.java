package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public class GetScoreIfNamesHaveSameNumberConsonants implements NamesScoreGetter {
    @Override
    public Integer getScore(Name firstName, Name secondName) {
        return firstName.numberOfConsonants() == secondName.numberOfConsonants() ? 12 : 0;
    }
}
