import javax.swing.JOptionPane;
import processing.core.PApplet;

public class Part1 extends PApplet {

    int x = 0;
    int y = 0;

    int height;
    int width;

    @Override
    public void settings() {
        size(900, 900);
    }

    @Override
    public void setup() {
        try {
            String v1 = JOptionPane.showInputDialog(null, "Вводи ширину доски:");
            String v2 = JOptionPane.showInputDialog(null, "Вводи высоту доски:");
            width = Integer.parseInt(v1);
            height = Integer.parseInt(v2);
        } catch (Exception e) {
            String v1 = JOptionPane.showInputDialog(null, "Вводи ширину доски:");
            String v2 = JOptionPane.showInputDialog(null, "Вводи высоту доски:");
            width = Integer.parseInt(v1);
            height = Integer.parseInt(v2);
        }
    }

    @Override
    public void draw() {

        x = 900 / 3;
        y = 900 / 3;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                int x1 = x + j * 50;
                int y1 = y + i * 50;


                if ((i + j) % 2 == 0) {
                    fill(34, 139, 34);   // тёмно-зелёный
                } else {
                    fill(255);          // белый
                }

                square(x1, y1, 50);


                if (mouseX >= x1 && mouseX <= x1 + 50 &&
                        mouseY >= y1 && mouseY <= y1 + 50)
                {
                    noFill();
                    stroke(255, 0, 0);      // красная рамка
                    strokeWeight(3);
                    rect(x1, y1, 50, 50);
                    noStroke();
                }

            }
        }
    }

//    @Override
//    public void keyPressed() {
//        if (key == ' ') {
//            System.out.println("You clicked on space");
//        }
//    }

    public static void main(String[] args) {
        PApplet.main("Part1");
    }
}
