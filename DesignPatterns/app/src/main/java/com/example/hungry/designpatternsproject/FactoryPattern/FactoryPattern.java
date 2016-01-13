package com.example.hungry.designpatternsproject.FactoryPattern;

/**
 * Created by Hungry on 1/14/2016.
 */
public class FactoryPattern {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }

        return null;
    }
}
