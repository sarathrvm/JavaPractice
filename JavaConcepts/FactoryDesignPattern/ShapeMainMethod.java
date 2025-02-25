package FactoryDesignPattern;

public class ShapeMainMethod {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape =shapeFactory.getShape(ShapeEnum.CIRCLE);

        shape.draw();

    }
}
