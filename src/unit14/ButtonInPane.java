package unit14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    @Override
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OOK"));
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("标题居中");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
