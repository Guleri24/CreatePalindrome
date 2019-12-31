package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Test
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Palindrome Generator");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
