package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public class GetScoreWhenBothNamesContainsAtLeastLove implements NamesScoreGetter {
    @Override
    public Integer getScore(Name firstName, Name secondName) {
        return firstName.containsAtLeastLove() && secondName.containsAtLeastLove() ? 7 : 0;
    }
}
