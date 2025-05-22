package com.example.trafficlightsgroup75;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.trafficlightsgroup75.controller.TrafficController;
import com.example.trafficlightsgroup75.view.ControlPanel;
import com.example.trafficlightsgroup75.view.IntersectionView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TrafficController controller = new TrafficController();
        IntersectionView intersectionView = new IntersectionView();
        ControlPanel controlPanel = new ControlPanel();

        controlPanel.startButton.setOnAction(e -> intersectionView.switchToGreen());
        controlPanel.stopButton.setOnAction(e -> intersectionView.switchToRed());

        VBox root = new VBox(20, controlPanel, intersectionView);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Traffic Light Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
