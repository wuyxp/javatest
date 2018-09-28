package unit14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipse extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        for (int i = 0; i < 16; i++) {
            Ellipse ellipse = new Ellipse(150, 100, 100, 50);
            ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            ellipse.setFill(Color.WHITE);
            ellipse.setRotate(i * 180 / 16);
            pane.getChildren().add(ellipse);
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
