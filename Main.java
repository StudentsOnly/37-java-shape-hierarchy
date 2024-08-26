import packageShape.Circle;
import packageShape.Rectangle;

public class Main{
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.setColor("green");
        circle.setRadius(3.25);
        circle.displayInfo();

        rectangle.setColor("red");
        rectangle.setWidth(4.2);
        rectangle.setHeight(5.5);
        rectangle.displayInfo();

    }

}
