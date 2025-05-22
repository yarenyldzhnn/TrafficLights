module com.example.trafficlightsgroup75 {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.trafficlightsgroup75 to javafx.graphics;
    opens com.example.trafficlightsgroup75 to javafx.fxml, javafx.graphics;



    exports com.example.trafficlightsgroup75.model;
    exports com.example.trafficlightsgroup75.controller;
    exports com.example.trafficlightsgroup75.view;
    exports com.example.trafficlightsgroup75.util;
}
