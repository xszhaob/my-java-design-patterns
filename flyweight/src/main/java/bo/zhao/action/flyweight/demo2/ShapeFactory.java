package bo.zhao.action.flyweight.demo2;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class ShapeFactory {

    private Map<ShapeType, Shape> shapeMap = new EnumMap<>(ShapeType.class);


    public Shape createShape(ShapeType type) {
        Shape shape = shapeMap.get(type);
        if (shape == null) {
            switch (type) {
                case CIRCLE:
                    shape = new Circle();
                    shapeMap.put(type, shape);
                    break;
                case SQUARE:
                    shape = new Square();
                    shapeMap.put(type, shape);
                    break;
                default:
                    break;
            }
        }
        return shape;
    }
}
