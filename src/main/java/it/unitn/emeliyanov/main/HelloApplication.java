package it.unitn.emeliyanov.main;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    final int NUM_X = 25;
    final int NUM_Y = 18;
    final int BLOCK_WIDTH = 40;

    @Override
    public void start(Stage stage) throws IOException {

        MainView view = new MainView(NUM_X, NUM_Y, BLOCK_WIDTH);

        stage.setScene(view.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}