package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public class GetScoreIfNamesFirstCharAreVowels implements NamesScoreGetter {
    @Override
    public Integer getScore(Name firstName, Name secondName) {
        return firstName.isFirstNameVowel() && secondName.isFirstNameVowel() ? 10 : 0;
    }
}
