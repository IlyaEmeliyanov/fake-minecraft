package it.unitn.emeliyanov.data;

public class NullBlock extends AbstractSolidBlock implements SmeltableBlock{

    public Block smelt() {
        return null;
    }
}
