module com.pikatimer.echoreceiver {
    requires javafx.controls;
    requires java.base;
    requires java.net.http;
    requires javafx.fxml;
    requires org.json;
    requires org.slf4j;
    requires java.prefs;
    requires org.controlsfx.controls; 

    opens com.pikatimer.echoreceiver to javafx.fxml;
    exports com.pikatimer.echoreceiver;
    
}
