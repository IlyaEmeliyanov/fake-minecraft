package it.unitn.emeliyanov.data;

import javafx.scene.image.Image;

public class GlassBlock extends AbstractSolidBlock {
    public GlassBlock() {
        super();
        this.setData("GL");
        this.blockName = "Glass";
        this.image = new Image(getClass().getResource("/images/glass.png").toString());
    }
}
