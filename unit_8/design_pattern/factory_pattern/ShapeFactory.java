class ShapeFactory {

    public Shape getShape(String type) {

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        if (type.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
    }
}
