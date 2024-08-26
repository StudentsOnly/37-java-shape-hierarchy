public class Shape {
    protected String color = "black";

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
    }
}
