class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayInfo() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + getColor());
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + calculateArea());
    }
}