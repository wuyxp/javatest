package unit14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("姓:"), new TextField(), new Label("MI"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(2);
        pane.getChildren().addAll(tfMi, new Label("名:"), new TextField());

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
