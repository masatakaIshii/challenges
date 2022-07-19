package fr.ts.challenges.lovematchcalculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MainTest {
    @Test
    void when_argument_contain_only_one_name_should_output_error() {
        var err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        Main.main(new String[]{"ForeverAlone"});

        assertThat(err.toString().trim()).isEqualTo("To score only one name is sad. If you love yourself, you can put your name and your name.");
    }

    @Test
    void when_argument_contain_more_than_2_names_should_output_error() {
        var err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        Main.main(new String[]{"poly", "ga", "my"});

        assertThat(err.toString().trim())
                .isEqualTo("Version with more than 2 names is still not available yet. Love between more than 2 people is still frowned upon in the country where I am");
    }

    @Test
    void when_arguments_are_luna_and_evan_should_output_score_51() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{"Luna", "Evan"});

        assertThat(out.toString().trim()).isEqualTo("Luna and Evan love score is 51");
    }
}