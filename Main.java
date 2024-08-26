public class Main{

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(2.0);
        System.out.printf("Circle area: %.2f for radius: %.2f and color: %s %n",
                circle.calculateArea(), circle.getRadius(), circle.getColor());

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Green");
        rectangle.setWidth(2.0);
        rectangle.setHeight(3.0);
        System.out.printf("Rectangle area: %.2f for width: %.2f and height: %.2f and color: %s %n",
                rectangle.calculateArea(), rectangle.getWidth(),
                rectangle.getHeight(), rectangle.getColor());


    }

}
