package basics.unit14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("hello world");
        Button button = new Button("ook");
        StackPane pane = new StackPane();
        button.setStyle("-fx-border-color: blue; -fx-color: pink");
        button.setRotate(-45);
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        label.setRotate(-45);
        pane.getChildren().add(button);
        pane.getChildren().add(label);
        pane.setRotate(45);
        pane.setStyle("-fx-border-color:red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("旋转?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
