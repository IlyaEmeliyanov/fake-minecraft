package it.unitn.emeliyanov.data;

public class Furnace {
    private SmeltableBlock input;
    private Block output;

    public Furnace() {
        this.input = new NullBlock();
        this.output = new NullBlock();
    }

    public void print() {
        System.out.println("|| "+this.input.getData() +" --> " +this.output.getData() +" ||");
    }

    public void smelt() {
        this.output = this.input;
        this.input = new NullBlock();
    }

    public void setInput(SmeltableBlock input) {
        this.input = input;
        this.smelt();
    }
}
