package it.unitn.emeliyanov.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Inventory {
    ArrayList<InventoryBlock> blocks;

    public Inventory() {
        blocks = new ArrayList<>(10);
    }

    public void print() {
        for (InventoryBlock b: blocks) {
            b.displayInInventory();
        }
    }

    void addBlock(InventoryBlock block) {
        blocks.add(block);
    }

    boolean isSmeltable(int index) {
        if (blocks.get(index) instanceof SmeltableBlock) return true;
        return false;
    }

    SmeltableBlock getSmeltableBlock(int index) {
        if (isSmeltable(3)) {
            return ((SmeltableBlock) blocks.get(index));
        }
        return null;
    }
}
