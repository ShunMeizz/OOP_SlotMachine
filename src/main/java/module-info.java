module com.example.casino_finalproject_oop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires javafx.media;

    opens com.example.casino_finalproject_oop to javafx.fxml;
    exports com.example.casino_finalproject_oop;
    exports com.example.casino_finalproject_oop.SlotMachine;
    opens com.example.casino_finalproject_oop.SlotMachine to javafx.fxml;
}