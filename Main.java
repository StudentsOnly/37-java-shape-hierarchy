public class Main{
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(5);
        System.out.println("Circle:");
        System.out.println("\tColor: " + circle.getColor());
        System.out.println("\tRadius: " + circle.getRadius());
        System.out.printf("\tArea: %.2f\n", circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        System.out.println("Rectangle");
        System.out.println("\tColor: " + rectangle.getColor());
        System.out.println("\tHeight: " + rectangle.getHeight());
        System.out.println("\tWidth: " + rectangle.getWidth());
        System.out.println("\tArea: " + rectangle.calculateArea());
    }

}
