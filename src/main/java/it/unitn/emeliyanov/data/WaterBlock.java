package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public class WaterBlock extends AbstractBlock {
    WaterBlock() {
        this.setData("W");
        this.blockName = "Water";
        this.fallsWithGravity = true;
        this.fallsThrough = true;
        this.image = new Image(getClass().getResource("/images/water.png").toString());
    }
}
