package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public class DirtBlock extends AbstractBlock {
    public DirtBlock() {
        this.setData("D");
        this.blockName = "Dirt";
        this.fallsThrough = false;
        this.fallsWithGravity = true;
        this.image = new Image(getClass().getResource("/images/dirt.png").toString());
    }
}