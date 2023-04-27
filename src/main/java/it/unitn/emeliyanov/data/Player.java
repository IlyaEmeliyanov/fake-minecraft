package it.unitn.emeliyanov.data;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Player extends Entity {

    public Player(int x, int y, int speed) {
       super(x, y, speed);
       config();
    }

    void config() {
        this.setX(this.getX());
        this.setY(this.getY());

        this.setWidth(60);
        this.setHeight(60);
        Image playerImg = new Image(getClass().getResource("/images/steve.png").toString());
        this.setFill(new ImagePattern(playerImg));
    }

    public void moveUp() { this.setY(this.getY()-10); }

    public void moveRight() {
        this.setX(this.getX()+10);
    }

    public void moveDown() {
        this.setY(this.getY()+10);
    }

    public void moveLeft() {
        this.setX(this.getX()-10);
    }
}
