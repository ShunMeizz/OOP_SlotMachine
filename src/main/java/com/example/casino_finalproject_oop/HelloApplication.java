package com.example.casino_finalproject_oop;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try{
           FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("slotmachine-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1200, 700);
            stage.setTitle("Slot Machine!");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        launch();
    }
}