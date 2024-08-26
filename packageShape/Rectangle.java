package packageShape;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public  void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public  double getHeight(){
        return height;
    }

    @Override
    public void calculateArea() {

        super.calculateArea();
        System.out.print(String.format("%.2f", width * height));
    }

    @Override
    public void displayInfo() {
        System.out.println("\nRectangle:");
        super.displayInfo();
    }
}
