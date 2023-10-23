package ds.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ds.vegetable.Vegetable;
import ds.vegetable.InvalidFruitRipenessException;
import ds.vegetable.InvalidFruitWeightException;
import ds.vegetable.Vegetable.TYPE;

class VegetableTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testVegetableConstructor() throws InvalidVegetableWeightException, InvalidVegetableRipenessException {
		// Create a new Onion, with a weight of 0.3kg and a ripeness of 100%. 
		Vegetable v = new Vegetable(Vegetable.TYPE.ONION, 0.3, 1);
		
		assertEquals(Vegetable.TYPE.ONION, v.getType(), "Vegetable type is incorrect");
		assertEquals(0.3, v.getWeight(), "Vegetable weight is incorrect");
		assertEquals(1, v.getRipeness(), "Vegetable ripeness is incorrect");
		
		assertThrows(InvalidVegetableWeightException.class, () -> {
	        new Vegetable(Vegetable.TYPE.ONION, -1.0, .5);
	    });

		assertThrows(InvalidVegetableRipenessException.class, () -> {
	        new Vegetable(Vegetable.TYPE.ONION, 1.0, 1.1);
	    });
	}
	
	

}
