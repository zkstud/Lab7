package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();

        primaryStage.setTitle("Zdarzenia");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.getScene().setOnKeyPressed((KeyEvent ev) -> controller.handleKeyPressed(ev));
        primaryStage.widthProperty().addListener((obs, ov, nv) -> controller.stageResized());
        primaryStage.heightProperty().addListener((obs, ov, nv) -> controller.stageResized());
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}