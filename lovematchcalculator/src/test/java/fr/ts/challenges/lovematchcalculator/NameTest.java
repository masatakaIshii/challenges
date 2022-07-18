package fr.ts.challenges.lovematchcalculator;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NameTest {

    @Nested
    class Has_same_length_method {
        @Test
        void when_name_same_length_than_given_name_should_return_true() {
            var name = new Name("same");
            var givenName = new Name("name");
            assertThat(name.hasSameLengthThan(givenName)).isTrue();
        }
        @Test
        void when_name_not_same_length_than_given_name_should_return_false() {
            var name = new Name("notsame");
            var givenName = new Name("length");
            assertThat(name.hasSameLengthThan(givenName)).isFalse();
        }
    }

    @Nested
    class Is_first_character_vowel {
        @ParameterizedTest()
        @ValueSource(strings = {"A", "Eric", "ursula", "yvan", "imane", "oceane"})
        void when_name_start_with_vowel_should_return_true(String value) {
            var name = new Name(value);

            assertThat(name.isFirstNameVowel()).isTrue();
        }

        @ParameterizedTest
        @ValueSource(strings = {"t", "zoe", "daniel"})
        void when_name_not_start_with_vowel_should_return_false(String value) {
            var name = new Name(value);

            assertThat(name.isFirstNameVowel()).isFalse();
        }
    }

    @Nested
    class Is_first_character_consonant {
        @ParameterizedTest
        @ValueSource(strings = {"Quentin", "william", "P"})
        void when_name_start_with_consonant_should_return_true(String value) {
            var name = new Name(value);

            assertThat(name.isFirstnameConsonant()).isTrue();
        }

        @ParameterizedTest
        @ValueSource(strings = {"Armand", "o", "Erwan"})
        void when_name_start_not_with_consonant_should_return_false(String value) {
            var name = new Name(value);

            assertThat(name.isFirstnameConsonant()).isFalse();
        }
    }

    @Nested
    class Number_of_vowels {
        @Test
        void when_name_is_louis_should_return_3() {
            var name = new Name("louis");

            assertThat(name.numberOfVowels()).isEqualTo(3);
        }

        @Test
        void when_name_is_a_should_return_1() {
            var name = new Name("a");

            assertThat(name.numberOfVowels()).isEqualTo(1);
        }

        @Test
        void when_name_is_Beatrice_should_return_1() {
            var name = new Name("Beatrice");

            assertThat(name.numberOfVowels()).isEqualTo(4);
        }
    }

    @Nested
    class Number_of_consonants {
        @Test
        void when_name_is_AOI_should_return_0() {
            var name = new Name("AOI");

            assertThat(name.numberOfConsonants()).isEqualTo(0);
        }

        @Test
        void when_name_is_patricia_should_return_4() {
            var name = new Name("patricia");

            assertThat(name.numberOfConsonants()).isEqualTo(4);
        }
    }

    @Nested
    class Contains_at_least_l_o_v_e {
        @Test
        void when_name_is_aya_should_return_false() {
            var name = new Name("aya");

            assertThat(name.containsAtLeastLove()).isFalse();
        }

        @ParameterizedTest
        @ValueSource(strings = {"lou", "Venom", "alain", "Coco", "Mariane"})
        void when_name_contain_at_least_l_o_v_or_e_should_return_true(String value) {
            var name = new Name(value);

            assertThat(name.containsAtLeastLove()).isTrue();
        }
    }
}