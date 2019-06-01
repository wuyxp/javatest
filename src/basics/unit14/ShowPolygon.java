package basics.unit14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ShowPolygon extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();

        final double WIDTH = 200, HEIGHT = 200;
        final int LENGTH = 5;
        double centerX = WIDTH / 2;
        double centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * .4;


        for (int i = 0; i < LENGTH; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / LENGTH));
            list.add(centerY + radius * Math.sin(2 * i * Math.PI / LENGTH));
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
