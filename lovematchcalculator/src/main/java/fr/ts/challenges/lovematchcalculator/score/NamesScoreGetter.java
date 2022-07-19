package fr.ts.challenges.lovematchcalculator.score;

import fr.ts.challenges.lovematchcalculator.Name;

public interface NamesScoreGetter {
    Integer getScore(Name firstName, Name secondName);
}
