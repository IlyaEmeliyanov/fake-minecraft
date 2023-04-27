package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public class GrassBlock extends AbstractBlock {
    public GrassBlock() {
        this.setData("GR");
        this.blockName = "Grass";
        this.fallsThrough = false;
        this.fallsWithGravity = true;
        this.image = new Image(getClass().getResource("/images/grass_block_side.png").toString());
    }
}
