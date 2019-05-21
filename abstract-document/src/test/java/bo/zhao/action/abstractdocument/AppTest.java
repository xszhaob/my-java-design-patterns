package bo.zhao.action.abstractdocument;

import bo.zhao.action.abstractdocument.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bo.Zhao
 * @since 19/5/16
 */
public class AppTest {

    @Test
    public void test() {
        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(HasPrice.PROPERTY, 10000L);
        carProperties.put(HasModel.PROPERTY, "300SL");

        Map<String, Object> wheelProperties = new HashMap<>();
        wheelProperties.put(HasType.PROPERTY, "wheel");
        wheelProperties.put(HasModel.PROPERTY, "15C");
        wheelProperties.put(HasPrice.PROPERTY, 100L);

        Map<String,Object> doorProperties = new HashMap<>();
        doorProperties.put(HasType.PROPERTY, "door");
        doorProperties.put(HasModel.PROPERTY, "Lambo");
        doorProperties.put(HasPrice.PROPERTY, 300L);

        carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));

        Car car = new Car(carProperties);
        System.out.println("-> model: "+ car.getModel());
        System.out.println("-> price: " + car.getPrice());
        car.getPart().forEach(p -> System.out.println("type: " + p.getType() + ",model: " + p.getModel() + ",price: " + p.getPrice()));
    }
}
