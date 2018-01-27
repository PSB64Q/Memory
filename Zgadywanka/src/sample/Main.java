package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Zgadywanka");
        FlowPane flow = new FlowPane();
        flow.setVgap(8);
        flow.setHgap(4);
        int imageId;
        for (int i=1; i<=8;i++){
            Button button = new Button("");
            imageId = i<=4 ? i : i-4;
            button.setPrefHeight(120);
            button.setPrefWidth(120);
            button.setId(String.valueOf(imageId));
            Image image = new Image(getClass().getResourceAsStream("/"+imageId+".png"));
            button.setGraphic(new ImageView(image));
            button.setOnAction(event -> {
                System.out.println("Kliknięto mnie");
                    });

            flow.getChildren().add (button);
        }

        primaryStage.setScene(new Scene(flow, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
