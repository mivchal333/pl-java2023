package java12.indent;

public class NoIndentTextFormatter {

    String noIndentText(String text) {
        return text.indent(Integer.MIN_VALUE);
    }
}
