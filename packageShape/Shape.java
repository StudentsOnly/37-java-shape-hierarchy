package packageShape;

public class Shape {

    protected String color;

    public Shape(){
        color = "black";
    }

    public Shape(String color){
        this.color = color;

    }

    public void setColor(String color){
        this.color = color;
    }

    public String gerColor(){
        return color;
    }

    public void calculateArea(){

        System.out.print("\nArea = ");
    }

    public void displayInfo(){
        System.out.print("color = '" + gerColor() + "'");
        calculateArea();
        System.out.print(" cm2");
        System.out.println();
    }

}
