class Shape {
    protected String color;

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty.");
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}