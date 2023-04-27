package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public class AbstractBlock implements Block {
    protected String data;
    protected boolean fallsWithGravity;
    protected boolean fallsThrough;
    public String blockName;
    protected Image image;

    public String getData() {
        return this.data;
    }
    public void print() { System.out.println(this.data);}
    public Image getImage() {return this.image;}
    public void setData(String data) { this.data = data; }
    public boolean getFallsWithGravity() { return this.fallsWithGravity; }
    public boolean getFallsThrough() { return this.fallsThrough; }

    public void displayInInventory() {
        System.out.print("["+this.data+"]");
    }

    @Override
    public String toString() {
        return (this.data + " ");
    }
}
