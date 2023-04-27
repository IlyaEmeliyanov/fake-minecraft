package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public class SandBlock extends AbstractBlock implements SmeltableBlock {
    SandBlock() {
        this.setData("S");
        this.fallsWithGravity = true;
        this.fallsThrough = false;
        this.blockName = "Sand";
        this.image = new Image(getClass().getResource("/images/sand.png").toString());
    }

    public Block smelt() {
        return new GlassBlock();
    }
}
