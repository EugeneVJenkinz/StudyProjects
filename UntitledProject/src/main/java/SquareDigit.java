package main.java;

import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SquareDigit {

    public static int squareDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : chars) {
            int number = Integer.parseInt(String.valueOf(ch));
            stringBuilder.append(number * number);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}

