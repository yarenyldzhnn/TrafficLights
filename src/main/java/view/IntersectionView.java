package view;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class IntersectionView extends Pane {
    private final Circle redLight;
    private final Circle greenLight;

    public IntersectionView() {
        redLight = new Circle(20, Color.RED);
        greenLight = new Circle(20, Color.GRAY);
        redLight.setTranslateX(50);
        greenLight.setTranslateX(100);
        getChildren().addAll(redLight, greenLight);
    }

    public void switchToGreen() {
        greenLight.setFill(Color.GREEN);
        redLight.setFill(Color.GRAY);
    }

    public void switchToRed() {
        greenLight.setFill(Color.GRAY);
        redLight.setFill(Color.RED);
    }
}
