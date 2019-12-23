package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public Button submit;
    public ListView<String> palindromeList;
    public TextField enter;

    public void onClickSubmit(ActionEvent actionEvent) {
        submit.setOnAction(e -> {
            String string = enter.getText();
            palindromeList.setItems(createPalindrome(string));
        });
    }

    private ObservableList<String> createPalindrome(String string) {
        char[] chars = string.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length-1; j++) {
               char[] s = Arrays.copyOfRange(chars,j,chars.length-1);
               list.add(Arrays.toString(s));
            }
        }
        return FXCollections.observableArrayList(list);
    }

    private void generatePalindrome(String string) {

    }
}
