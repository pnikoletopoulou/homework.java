package homework_01.Geometry;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        for (int i = 0; i < height; i++) {
            if (i > 0 && i < height - 1) {
                System.out.print("*");
                for (int j = 0; j < (width - 2); j++) {
                    System.out.print(" ");
                }

                if ( width > 1 ) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
