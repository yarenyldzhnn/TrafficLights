package com.example.trafficlightsgroup75.view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ControlPanel extends HBox {
    public Button startButton;
    public Button stopButton;

    public ControlPanel() {
        startButton = new Button("Start");
        stopButton = new Button("Stop");

        this.setSpacing(10);
        this.getChildren().addAll(startButton, stopButton);
    }
}
