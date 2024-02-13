module com.javafx.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.javafx.helloworld to javafx.fxml;
    exports com.javafx.helloworld;
}