package it.unitn.emeliyanov.data;

public class AbstractSolidBlock extends AbstractBlock {
    public AbstractSolidBlock() {
        this.fallsThrough = false;
        this.fallsWithGravity = false;
    }
}
