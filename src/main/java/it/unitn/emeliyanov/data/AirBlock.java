package it.unitn.emeliyanov.data;

public class AirBlock extends AbstractBlock {

    public AirBlock() {
        this.setData(".");
        this.blockName = "Air";
        this.fallsWithGravity = false;
        this.fallsThrough = true;
    }

}