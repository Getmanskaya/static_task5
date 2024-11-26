package org.example;

import java.util.Arrays;

public class StringUtilsTask {

    public static String removeSpaces() {
        String yourString = "Катя ела шоколад";
        /*  String withoutWhitespace = StringUtils.deleteWhitespace(yourString);*/
        String withoutWhitespace = yourString.replaceAll("\\s", "");
        return withoutWhitespace;
    }

    public static String replaceSubstrings(String oldWorld, String newWorld) {
        String beforeReplace = "Катя ела шоколад";
        String afterReplace = beforeReplace.replaceAll("ела", "не ела");
        return afterReplace;
    }
    public static void splitString(String delimiter){
        String beforeSplit = "Катя,ела,шоколад";
        String[] afterSplit = beforeSplit.split(",");
        for (String word : afterSplit) {
            System.out.println(word);
        }
    }

    public static void isEmpty(){
        String firstForCheck = "";
        String secondForCheck = "Не пустая строка";
        System.out.println(firstForCheck.isEmpty());
        System.out.println(secondForCheck.isEmpty());

    }

    public static void trimLeadingAndTrailingSpaces(){
        String stringWithFirstLastSpaces = "  Катя ела шоколад и пробелы    ";
        String stringWithOutFirstLastSpaces = stringWithFirstLastSpaces.trim();
        System.out.println(stringWithOutFirstLastSpaces);
    }



    public static void main(String[] args) {
        System.out.println(removeSpaces());
        System.out.println(replaceSubstrings("ела", "не ела"));
        StringUtilsTask.splitString(",");
        StringUtilsTask.isEmpty();
        StringUtilsTask.trimLeadingAndTrailingSpaces();

    }
}