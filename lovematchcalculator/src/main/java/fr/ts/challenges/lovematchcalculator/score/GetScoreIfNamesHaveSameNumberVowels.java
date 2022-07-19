package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public class GetScoreIfNamesHaveSameNumberVowels implements NamesScoreGetter {
    @Override
    public Integer getScore(Name firstName, Name secondName) {
        return firstName.numberOfVowels() == secondName.numberOfVowels() ? 12 : 0;
    }
}
