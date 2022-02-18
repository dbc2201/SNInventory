module io.dbc.github.sninventory {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.sninventory to javafx.fxml;
    exports io.dbc.github.sninventory;
}