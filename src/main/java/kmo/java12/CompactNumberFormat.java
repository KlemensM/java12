package kmo.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {
        final var english = new Locale("en", "US");
        final var shortFormat = NumberFormat.getCompactNumberInstance(english, NumberFormat.Style.SHORT);
        shortFormat.setMaximumFractionDigits(3);

        final var longFormat = NumberFormat.getCompactNumberInstance(english, NumberFormat.Style.LONG);
        longFormat.setMaximumFractionDigits(3);

        System.out.println(shortFormat.format(1337));
        System.out.println(longFormat.format(1337));
    }
}
