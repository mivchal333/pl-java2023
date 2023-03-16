package java12.transform;

public class ImportedCSVTextProcessor {

    String process(String line) {
        // implement here
        // 1. replace "," with space
        // 2. remove "none"
        // 3. remove white spaces from start and end
        // 4. add "-done" at the end
        // 5. to uppercase
        return line
                .transform(s -> s.replace(",", " "))
                .transform(s -> s.replace("none", ""))
                .transform(s -> s.strip())
                .transform(s -> s + "-done")
                .transform(s -> s.toUpperCase());

    }
}
