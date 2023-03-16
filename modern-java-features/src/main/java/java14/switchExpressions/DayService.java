package java14.switchExpressions;

public class DayService {

    int getDayNumberOfLettersForWorkday(Day day) {
        return switch (day){
            case MONDAY, FRIDAY -> 6;
            case TUESDAY -> 7;
            case WEDNESDAY -> 9;
            case THURSDAY -> 8;
            default -> throw new IllegalStateException("Non working day!");
        };
    }
}
