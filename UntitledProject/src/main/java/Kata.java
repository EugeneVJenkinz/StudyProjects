package main.java;

public class Kata
{
    public static String reverseWords(final String original)
    {
        String[] split = original.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        if (split.length > 0) {
            for (String str : split) {
                StringBuilder helper = new StringBuilder();
                helper.append(str).reverse().toString();
                stringBuilder.append(helper + " ");
            }
            return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
        }
        else return "   ";
    }
}