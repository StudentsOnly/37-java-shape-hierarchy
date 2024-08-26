public class Main{
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setColor("Rose");
        circle.setRadius(16);
        circle.displayInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Violet");
        rectangle.setWidth(5);
        rectangle.setHeight(8);
        rectangle.displayInfo();
    }
}
