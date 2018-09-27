package unit14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("image/via.jpg");
        pane.getChildren().add(new ImageView(image));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("图片");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
