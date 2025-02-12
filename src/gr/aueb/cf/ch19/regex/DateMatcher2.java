package gr.aueb.cf.ch19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher2 {

    public static void main(String[] args) {
        String date = "21/06/2024 07/08/2025";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        // group 0 -> the whole date
        while (matcher.find()) {
            String grDate = "";
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
                // grDate += matcher.group(i) + "/";
            }
            System.out.println();
        }
    }
}