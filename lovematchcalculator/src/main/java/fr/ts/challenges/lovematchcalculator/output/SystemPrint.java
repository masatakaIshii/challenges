package fr.ts.challenges.lovematchcalculator.output;

public class SystemPrint implements Print {
    @Override
    public void out(String message) {
        System.out.println(message);
    }

    @Override
    public void err(String message) {
        System.err.println(message);
    }
}
