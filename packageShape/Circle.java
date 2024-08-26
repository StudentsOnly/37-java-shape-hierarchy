package packageShape;

public class Circle extends Shape {

     double radius;

    public Circle(){
        super();
        radius = 0;
    }

    public Circle(double radius){
        super();
        this.radius =radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void calculateArea() {

        super.calculateArea();
        System.out.print(String.format("%.2f",Math.PI * Math.sqrt(radius)));
    }

    @Override
    public void displayInfo() {
        System.out.println("\nCircle:");
        super.displayInfo();
    }

}
