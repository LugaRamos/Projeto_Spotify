module com.spotify {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.spotify to javafx.fxml;
    exports com.spotify;
}
