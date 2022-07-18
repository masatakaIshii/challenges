package fr.ts.challenges.lovematchcalculator;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public record Name(String value) {

    public boolean hasSameLengthThan(Name givenName) {
        return this.value.length() == givenName.value.length();
    }

    public boolean isFirstNameVowel() {
        return Pattern
                .compile("^[AEIOUY]\\S*", Pattern.CASE_INSENSITIVE)
                .matcher(this.value)
                .matches();
    }

    public boolean isFirstnameConsonant() {
        return Pattern
                .compile("^[^AEIOUY]\\S*", Pattern.CASE_INSENSITIVE)
                .matcher(this.value)
                .matches();
    }

    public int numberOfVowels() {
        return Pattern
                .compile("[AEIOUY]", Pattern.CASE_INSENSITIVE)
                .matcher(this.value)
                .results()
                .map(MatchResult::group).toList()
                .size();
    }

    public int numberOfConsonants() {
        return Pattern
                .compile("[^AEIOUY]", Pattern.CASE_INSENSITIVE)
                .matcher(this.value)
                .results()
                .map(MatchResult::group).toList()
                .size();
    }

    public boolean containsAtLeastLove() {
        return Pattern
                .compile("[LOVE]", Pattern.CASE_INSENSITIVE)
                .matcher(this.value)
                .find();
    }
}
