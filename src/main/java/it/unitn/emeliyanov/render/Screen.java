package it.unitn.emeliyanov.render;

public class Screen {
//    private final int NUM_X;
//    private final int NUM_Y;
//    private final int BLOCK_WIDTH;

//    Screen(Group root, Map map, int numX, int numY, int blockWidth) {
//        this.NUM_X = numX;
//        this.NUM_Y = numY;
//        this.BLOCK_WIDTH = blockWidth;
//        // Taking the default texture to display
//        Image grassTop = new Image(getClass().getResource("/images/grass.png").toString());
//        Image grassBottom = new Image(getClass().getResource("/images/grass2.png").toString());
//        // Rendering the map based on the values of the blocks
//        render(map);
//    }
//
//    public void render(Map map) {
//        for (int i = 0; i < NUM_Y; i++) {
//            for (int j = 0; j < NUM_X; j++) {
//                if (map.getData()[i][j].getData() == 'X') {
//                    // Creating the image view
//                    ImageView imageView = new ImageView(grassTop);
//                    if (i > 0 && map.getData()[i-1][j].getData() == 'X') imageView = new ImageView(grassBottom);
//                    imageView.setX(j*BLOCK_WIDTH);
//                    imageView.setY(i*BLOCK_WIDTH);
//                    imageView.setFitWidth(40);
//                    imageView.setPreserveRatio(true);
//                    root.getChildren().add(imageView);
//                }
//            }
//        }
//    }
}
