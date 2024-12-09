package es.ieslosmontecillos.micontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)
    {
        VBox root = new VBox();

        MiControl miControl = new MiControl();

        miControl.setOnAction(_ -> System.out.println("Mi control ha sido presionado"));

        root.getChildren().add(miControl);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}