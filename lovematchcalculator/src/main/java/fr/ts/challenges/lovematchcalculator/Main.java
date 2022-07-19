package fr.ts.challenges.lovematchcalculator;

import fr.ts.challenges.lovematchcalculator.output.Print;
import fr.ts.challenges.lovematchcalculator.output.SystemPrint;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(args);
        Print print = new SystemPrint();
        Calculator calculator = new Calculator();

        Main.match(names, print, calculator);
    }

    public static void match(List<String> names, Print print, Calculator calculator) {
        if (names.size() < 2) {
            print.err("To score only one name is sad. If you love yourself, you can put your name and your name.");
            return;
        }
        if (names.size() > 2) {
            print.err("Version with more than 2 names is still not available yet. Love between more than 2 people is still frowned upon in the country where I am");
            return;
        }
        var firstName = names.get(0);
        var secondName = names.get(1);
        var loveScore = calculator.calculate(firstName, secondName);
        print.out(String.format("%s and %s love score is %d", firstName, secondName, loveScore));
    }
}
