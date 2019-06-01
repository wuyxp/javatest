package basics.sudoku.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Dashboard extends Application {
    @Override
    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        pane.setPrefWidth(450);
        pane.setPrefHeight(600);
        pane.setTop(new TopPane());
        pane.setCenter(new CenterPane());
        pane.setBottom(new BottomPane());

        Scene scene = new Scene(pane);
        primaryStage.setResizable(false);
        primaryStage.setTitle("数独游戏");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class TopPane extends Pane{
    public TopPane(){
        getChildren().add(new Label("数独游戏"));
        setStyle("-fx-background-color: #0099CC");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}
class CenterPane extends Pane{
    public CenterPane(){

    }
}
class BottomPane extends Pane{
    public BottomPane(){

    }
}
