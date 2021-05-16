package kmo.java12;

public class PatternMatching {

    public static void main(String[] args) {
        final Object object = "value";

        if (object instanceof String string) {
            System.out.println(string.substring(1));
        }
    }
}
