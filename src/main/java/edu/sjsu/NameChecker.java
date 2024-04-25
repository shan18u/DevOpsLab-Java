package edu.sjsu;

import java.util.regex.Pattern;

public class NameChecker {
    /**
     
Checks if a given string is a valid name following these rules:
Between 2 to 40 characters
Contains only alphabetic characters, non-consecutive hyphens, or a single quote
Cannot start with a hyphen or single quote
@param input Name to check
@return True if input is a valid name, else false
*/
public static boolean check(String input) {
    //check if the length of string is between 2 and 40 characters
    if (input.length() < 2 || input.length() > 40) {
        return false;
    }

    //check if string contains only alphabetic characters, non-consecutive hyphens, or a single quote
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (!Character.isLetter(c) && c != '-' && c != '\'') {
            return false;
        }
        // Hyphen or single quote cannot be the first or last character
        if ((c == '-' || c == '\'') && (i == 0 || i == input.length() - 1)) {
            return false;
        }
        // Hyphens cannot be consecutive
        if (c == '-' && i > 0 && input.charAt(i - 1) == '-') {
            return false;
        }
    }

    return true;
}
}
