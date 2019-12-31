package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    public Button submit;
    public ListView<String> palindromeList;
    public TextField enter;

    public void onClickSubmit() {
        submit.setOnAction(e -> {
            String string = enter.getText();
            palindromeList.setItems(PalindromeGenerator.generatePalindrome(string));
        });
    }
}


