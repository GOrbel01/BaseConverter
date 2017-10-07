package com.geo.decconv.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DecimalConverterMain extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Decimal Converter");
        initialiseLayout();
    }

    public void initialiseLayout() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();

//            URL url = new File("//src/main/java/com/geo/decconv/main/calcwindow.fxml").toURI().toURL();
            URL url = DecimalConverterMain.class.getResource("/calcwindow.fxml");
            System.out.println(url.getPath());
            fxmlLoader.setLocation(url);
            rootLayout = (AnchorPane) fxmlLoader.load();
            Scene scene = new Scene(rootLayout);

            primaryStage.show();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
