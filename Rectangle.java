public class Rectangle extends Shape {
    double width;
    double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The rectangle area is: " + this.calculateArea());
    }
}
