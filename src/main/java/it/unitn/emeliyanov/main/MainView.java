package it.unitn.emeliyanov.main;

import it.unitn.emeliyanov.data.Furnace;
import it.unitn.emeliyanov.data.Map;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;

import it.unitn.emeliyanov.data.Player;

public class MainView {
    final int NUM_X;
    final int NUM_Y;
    final int BLOCK_WIDTH;

    int curX = 0;
    int curY = 0;

    private Scene scene;
    private Group root;
    private Player player;

    private Map map;
    private Furnace furnace;

    private EventHandler<KeyEvent> keyPressedHandler;
    private EventHandler<KeyEvent> keyReleasedHandler;

    MainView(int NUM_X, int NUM_Y, int BLOCK_WIDTH) {
        this.NUM_X = NUM_X;
        this.NUM_Y = NUM_Y;
        this.BLOCK_WIDTH = BLOCK_WIDTH;

        map = new Map(NUM_X, NUM_Y);
        furnace = new Furnace();

//        animate(); // start a timer that updates every frame
        render(); // draws the canvas
        configScene(); // configs the UI of the scene and sets the event handlers
    }


    private void render() {
        // Creating the root component
        Group root = new Group();
        this.setRoot(root);

        // Player's logic
        this.player = new Player(0, 0, 2);


        // Rendering the blocks base on the textual map
        for (int i = 0; i < NUM_Y; i++) {
            for (int j = 0; j < NUM_X; j++) {
                ImageView imageView = new ImageView(this.map.getData()[i][j].getImage());
                imageView.setX(j * BLOCK_WIDTH);
                imageView.setY(i * BLOCK_WIDTH);
                imageView.setFitWidth(40);
                imageView.setPreserveRatio(true);
                root.getChildren().add(imageView);
            }
        }

        this.root.getChildren().add(player);
    }

    private void animate() {
        AnimationTimer timer = new AnimationTimer() {
            double myTime = 0.0;
            double speedY = 0.0;
            double speedX = 0.0;
            double gravity = 15.8;
            double prevSpeed = 0.0;
            int counter = 0;

            @Override
            public void handle(long l) {
                System.out.println(l);

                map.updateMap();

//                counter++;
//                System.out.println(counter);
//                double curX = player.getX();
//                double curY = player.getY();
//                speedY += 0.5*gravity*Math.pow(myTime, 2);
//                double deltaY = speedY;
//                double deltaX = speedX;
            }
        };
        timer.start();
    }

    private void configScene() {
        Scene scene = new Scene(this.root, BLOCK_WIDTH * NUM_X, BLOCK_WIDTH * NUM_Y);
        scene.setFill(Color.web("#F9F5DC"));

        // Adding event handlers to the scene
        keyPressedHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.W && player.getY() != 0) player.moveUp();
                else if (keyEvent.getCode() == KeyCode.D && curX != BLOCK_WIDTH*(NUM_X-1)) player.moveRight();
                else if (keyEvent.getCode() == KeyCode.S && curY != BLOCK_WIDTH*(NUM_Y-1)) player.moveDown();
                else if (keyEvent.getCode() == KeyCode.A && player.getX() != 0) player.moveLeft();
            }
        };

        keyReleasedHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                player.setX(player.getX());
                player.setY(player.getY());
            }
        };

        scene.addEventHandler(KeyEvent.KEY_PRESSED, keyPressedHandler);
        scene.addEventHandler(KeyEvent.KEY_RELEASED, keyReleasedHandler);

        this.setScene(scene);
    }

    // Root component
    public Group getRoot() {
        return this.root;
    }
    public void setRoot(Group root) {
        this.root = root;
    }

    // Scene component
    public Scene getScene() {
        return this.scene;
    }
    public void setScene(Scene scene) {
        this.scene = scene;
    }


}
