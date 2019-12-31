package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

class PalindromeGenerator {
    static ObservableList<String> generatePalindrome(String s) {
        char[] chars = s.toCharArray();
        var temp = ' ';
        char[] charsClone = chars.clone();
        for (int i = 0; i < charsClone.length / 2; i++) {
            temp = charsClone[i];
            charsClone[i] = charsClone[charsClone.length - i - 1];
            charsClone[charsClone.length - i - 1] = temp;
        }
        List<String> list = new ArrayList<>();
        StringBuilder s1 = new StringBuilder();

        // for String size less than 2 -> example h
        if (chars.length < 2) list.add(s + s);

        // for String size greater than 2 -> example help
        else {

            // if string is palindrome -> example tit
            if (Arrays.toString(chars).equals(Arrays.toString(charsClone))) {
                s1.append(chars);
                list.add(s1.toString());
                list.add(s1.toString() + s1.toString());
            }

            // if String is not palindrome -> tits
            else {

                //  add String and its reverse form to string
                s1.append(chars);
                list.add(s1.toString() + s1.reverse().toString());

                Arrays.sort(charsClone);

                // create palindrome of string
                for (int i = 0; i < chars.length - 1; i++) {
                    if (charsClone[i] == charsClone[i + 1]) {
                        for (char aChar : chars) {
                            if (charsClone[i] != aChar) {
                                list.add(""+ charsClone[i] + aChar + charsClone[i]);
                            }
                        }
                    }
                }
            }

        }
        return FXCollections.observableList(list);
    }
}
