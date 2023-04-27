package it.unitn.emeliyanov.data;

import it.unitn.emeliyanov.utils.Coordinate;

import java.util.Random;

public class Map {
    private Block[][] data;
    private final int NUM_X;
    private final int NUM_Y;

    private final double SEED = 0.8;

    public Map() {
        this.NUM_X = 10;
        this.NUM_Y = 10;
        generateBlocks();
    }

    public Map(int numX, int numY) {
        this.NUM_X = numX;
        this.NUM_Y = numY;
        generateBlocks();
    }

    void generateBlocks() {
        this.data = new Block[this.NUM_Y][this.NUM_X];

        Random rand = new Random();
        double flag;

        for (int j = 0; j < this.NUM_X; j++) this.data[this.NUM_Y-1][j] = new AirBlock();
        for (int i = this.NUM_Y-2; i >= 0; i--) {
            for (int j = 0; j < this.NUM_X; j++) {
                flag = rand.nextDouble();
                if (flag < this.SEED) this.data[i][j] = new AirBlock();
                else this.data[i][j] = new DirtBlock();
            }
        }
        this.updateMap();
        addRowsOfBlocks(3);
        this.print();
    }

    public Block[][] getData() {
        return this.data;
    }

    public void print() {
        for (int i = 0; i < this.NUM_Y; i++) {
            for (int j = 0; j < this.NUM_X; j++)
                System.out.print(this.data[i][j]);
            System.out.print("\n");
        }
        System.out.println("\n");
    }

    public void insertAtCoords(int x, int y, char data) {
        if (x >= 0 && x < this.NUM_X && y >= 0 && y < this.NUM_Y) {
            this.data[this.NUM_Y-y-1][x] = new AirBlock();
        }
    }

    public void updateMap() {
        for (int i = this.NUM_Y-2; i >= 0; i--) {
            for (int j = 0; j < this.NUM_X; j++) {
                Coordinate coords = new Coordinate(j, this.NUM_Y-i);
                blockFall(coords);
            }
        }
    }

    public void blockFall(Coordinate coords) {
        while (coords.getY() >= 1 && coords.getY() < this.NUM_Y) {
            swap(coords);
            coords.setY(coords.getY()-1);
        }
    }

    public void swap(Coordinate coords) {
        int x = coords.getX();
        int y = coords.getY();
        if (x >= 0 && x < this.NUM_X) {
            if (this.data[this.NUM_Y-y-1][x].getFallsWithGravity() && this.data[this.NUM_Y-y][x].getFallsThrough()) {
                Block tmp = this.data[this.NUM_Y-y-1][x];
                this.data[this.NUM_Y-y-1][x] = this.data[this.NUM_Y-y][x];
                this.data[this.NUM_Y-y][x] = tmp;

                print();
            }
        }
    }

    private void addRowsOfBlocks(int rows) {
        int count = 0;

        for (int j = 0; j < this.NUM_X; j++) {
            for (int i = this.NUM_Y-1; i >= 0 && count < rows; i--) {
                if (this.data[i][j].getData() == ".") {
                    this.data[i][j] = new SandBlock();
                    count++;
                }
            }
            count = 0;
        }
    }
}
