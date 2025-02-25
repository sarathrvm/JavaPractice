package FactoryDesignPattern;

public class ShapeFactory {
    ShapeEnum shapeEnum;

    public Shape getShape(ShapeEnum shapeEnum){
        if(shapeEnum.equals(ShapeEnum.CIRCLE)){
            return new CircleShape();
        } else if (shapeEnum.equals(ShapeEnum.RECTANGLE)) {
            return new RectangleShape();
        }
        else{
            throw new IllegalArgumentException("unknown shape name");
        }

    }

}
