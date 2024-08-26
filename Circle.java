public class Circle extends Shape {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The circle area is: " + calculateArea());
    }
}
