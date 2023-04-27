package it.unitn.emeliyanov.data;

import javafx.scene.shape.Rectangle;

public class Entity extends Rectangle {
    private int x;
    private int y;
    private int speed;
    private boolean fallsWithGravity;
    private boolean fallsThrough;

    public Entity(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.fallsWithGravity = true;
        this.fallsThrough = false;
    }

    public int getSpeed() {
        return speed;
    }


}
