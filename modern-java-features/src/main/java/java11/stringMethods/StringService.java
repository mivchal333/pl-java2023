package java11.stringMethods;

import java.util.List;
import java.util.stream.Collectors;

public class StringService {

    List<String> getOnlyNotBlankStrings(List<String> input) {
        // implement here
        return input.stream()
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());
    }

    List<String> getStrippedTextLines(String text) {
        // implement here
        // split text to lines and strip
        return text.lines()
                .map(s -> s.strip())
                .collect(Collectors.toList());
    }

    List<String> extendFoundStringByRepeatSomeTimes(List<String> list, String searchedText, int nTimesRepeat) {
        // implement here
        // search for searchedText in a list. Change this string by repeat n times if found
        return list.stream()
                .map(text -> {
                    if (searchedText.equals(text)) {
                        return text.repeat(nTimesRepeat);
                    }
                    return text;
                })
                .collect(Collectors.toList());
    }
}
