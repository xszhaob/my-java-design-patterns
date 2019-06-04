package bo.zhao.action.flyweight.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class DrawingBoard {

    private List<PositionShape> shapeList = new ArrayList<>();

    private ShapeFactory shapeFactory = new ShapeFactory();



    public void draw() {
        PositionShape topCircle = new PositionShape(shapeFactory.createShape(ShapeType.CIRCLE));
        topCircle.setHeight(10);
        topCircle.setWeight(10);
        PositionShape bottomCircle = new PositionShape(shapeFactory.createShape(ShapeType.CIRCLE));
        bottomCircle.setHeight(1000);
        bottomCircle.setWeight(1000);

        PositionShape topSquare = new PositionShape(shapeFactory.createShape(ShapeType.SQUARE));
        topSquare.setHeight(8);
        topSquare.setWeight(8);
        PositionShape bottomSquare = new PositionShape(shapeFactory.createShape(ShapeType.SQUARE));
        bottomSquare.setHeight(980);
        bottomSquare.setWeight(980);
        shapeList.add(topCircle);
        shapeList.add(bottomCircle);
        shapeList.add(topSquare);
        shapeList.add(bottomSquare);
    }


    public void show() {
        for (PositionShape positionShape : shapeList) {
            positionShape.print();
        }
    }

}
