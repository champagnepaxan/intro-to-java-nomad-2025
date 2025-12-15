import processing.core.PApplet;

public class Part2 extends PApplet {


    float x1, y1;
    float speed1;
    float angle1;


    float x2, y2;
    float speed2;
    float angle2;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        stroke(255);
        strokeWeight(3);


        x1 = random(width);
        y1 = random(-200, 0);
        speed1 = 1.5f;
        angle1 = 0;


        x2 = random(width);
        y2 = random(-400, 0);
        speed2 = 2.2f;
        angle2 = 0;
    }

    public void draw() {
        background(0);


        drawSnowflake(x1, y1, angle1);
        y1 += speed1;
        angle1 += 0.01f;

        if (y1 > height + 20) {
            y1 = -20;
            x1 = random(width);
        }


        drawSnowflake(x2, y2, angle2);
        y2 += speed2;
        angle2 += 0.01f;

        if (y2 > height + 20) {
            y2 = -20;
            x2 = random(width);
        }
    }

    void drawSnowflake(float x, float y, float angle) {
        pushMatrix();
        translate(x, y);
        rotate(angle);


        line(-20, 0, 20, 0);
        rotate(PI / 3);
        line(-20, 0, 20, 0);
        rotate(PI / 3);
        line(-20, 0, 20, 0);

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Part2");
    }
}