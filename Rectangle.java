class Rectangle extends Shape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative.");
        }
        return width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    public void displayInfo() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + getColor());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Area: " + calculateArea());
    }
}