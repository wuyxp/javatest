package basics.unit14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("button");
        Scene scene = new Scene(btOK, 200, 240);


        primaryStage.setTitle("title");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

//    public static void main(String[] args){
//        Application.launch(args);
//    }
}
