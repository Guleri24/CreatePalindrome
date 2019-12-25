package sample;

import javafx.collections.*;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.*;

public class Controller {

    public Button submit;
    public ListView<String> palindromeList;
    public TextField enter;

    public void onClickSubmit() {
        submit.setOnAction(e -> {
            String string = enter.getText();
            palindromeList.setItems(generatePalindrome(string));
        });
    }

    private ObservableList<String> generatePalindrome(String s) {
        char[] chars = s.toCharArray();
        char temp;
        List<String> list = new ArrayList<>();
        if (chars.length < 2) list.add(s + s);
        else {
            for (int i = 0; i < chars.length / 2; i++) {
                temp = chars[i];
                chars[i] = chars[chars.length - i - 1];
                chars[chars.length - i - 1] = temp;
            }
            Map<Character, Integer> map = new HashMap<>();
            // Traverse through array elements and count frequencies

            for (char aChar : chars) {
                if (map.containsKey(aChar)) map.put(aChar, map.get(aChar) + 1);
                else map.put(aChar, 1);
            }
            if (map.containsValue(1)) {
                list.add(nonMatchPalindrome(s,chars));
            }
            else {


            }

        }
        return FXCollections.observableList(list);

    }

    private String nonMatchPalindrome(String s, char[] chars) {
        return s+ String.valueOf(chars);
    }
}

