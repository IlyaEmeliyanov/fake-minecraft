package it.unitn.emeliyanov.data;

public interface InventoryBlock {
    void displayInInventory();
    void addBlock(Block block);
    boolean isSmeltable(int index);
    SmeltableBlock getSmeltableBlock(int index);
}
