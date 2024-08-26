public class Main {

    public static void main(String[] args) {

        System.out.println("====CIRCLE====");
        Circle circle = new Circle();
        circle.setRadius(4.5);
        circle.displayInfo();

        System.out.println("====Rectangle====");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(4);
        rectangle.displayInfo();
    }

}
