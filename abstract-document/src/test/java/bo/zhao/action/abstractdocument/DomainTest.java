package bo.zhao.action.abstractdocument;

import bo.zhao.action.abstractdocument.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public class DomainTest {

    private static final String TEST_PART_TYPE = "test-part-type";

    private static final String TEST_PART_MODEL = "test-part-model";

    private static final long TEST_PART_PRICE = 0L;

    private static final String TEST_CAR_MODEL = "test-car-model";

    private static final long TEST_CAR_PRICE = 1L;

    @Test
    public void shouldConstructPart() {
        Map<String, Object> properties = new HashMap<>(3);
        properties.put(HasType.PROPERTY, TEST_PART_TYPE);
        properties.put(HasModel.PROPERTY, TEST_PART_MODEL);
        properties.put(HasPrice.PROPERTY, TEST_PART_PRICE);
        Part part = new Part(properties);

        assertEquals(TEST_PART_TYPE, part.getType().get());
        assertEquals(TEST_PART_MODEL, part.getModel().get());
        assertEquals(TEST_PART_PRICE, part.getPrice().get());
    }

    @Test
    public void shouldConstructCar() {
        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(HasModel.PROPERTY, TEST_CAR_MODEL);
        carProperties.put(HasPrice.PROPERTY, TEST_CAR_PRICE);
        carProperties.put(HasParts.PROPERTY, Arrays.asList(new HashMap(), new HashMap()));
        Car car = new Car(carProperties);

        assertEquals(TEST_CAR_MODEL, car.getModel().get());
        assertEquals(TEST_CAR_PRICE, car.getPrice().get());
        assertEquals(2, car.getPart().count());
    }
}
