public class Circle extends Shape{
    double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
