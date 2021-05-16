package kmo.java12;

import java.time.Month;
import java.util.List;

public class SwitchExpressions {

    public static void main(String[] args) {
        System.out.println(getSeason(Month.JANUARY));
    }

    public static int getSeason(final Month month) {
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> 1;
            case APRIL, MAY, JUNE -> 2;
            case JULY, AUGUST, SEPTEMBER -> 3;
            case OCTOBER, NOVEMBER, DECEMBER -> 4;
        };
    }

    public static List<Month> getMonths(final int season) {
        return switch (season) {
            case 1 -> {
                System.out.println(1);
                yield List.of(Month.JANUARY, Month.FEBRUARY, Month.MARCH);
            }
            case 2 -> {
                System.out.println(2);
                yield List.of(Month.APRIL, Month.MAY, Month.JUNE);
            }
            case 3 -> {
                System.out.println(3);
                yield List.of(Month.JULY, Month.AUGUST, Month.SEPTEMBER);
            }
            case 4 -> {
                System.out.println(4);
                yield List.of(Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
            }
            default -> throw new IllegalArgumentException("unknown season");
        };
    }
}
