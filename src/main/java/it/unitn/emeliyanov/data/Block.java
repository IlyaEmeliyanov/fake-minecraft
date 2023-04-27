package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public interface Block {
    String getData();
    void print();
    Image getImage();
    void setData(String data);
    boolean getFallsWithGravity();
    boolean getFallsThrough();
}
