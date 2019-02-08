package it.techgap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import it.techgap.flatten.FlattenArrays;

public class FlattenArraysTests {

	@Test
	public void flattenArrayNullArray() {
		Object[] nestedArray = null;
		Integer[] actuals = FlattenArrays.flattenArrayMethod(nestedArray);
		assertNull(actuals);
	}
	
	@Test
	public void flattenArrayEmptyArray() {
		Object[] nestedArray = {};
		Integer[] expecteds = new Integer[]{};
		Integer[] actuals = FlattenArrays.flattenArrayMethod(nestedArray);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void flattenArrayTest(){
		Integer[] expecteds = null;
		Integer[] actuals = null;
		
		Object[] flattenArray = {1, 4, 6, 7, 5};
		expecteds = new Integer[]{1, 4, 6, 7, 5};
		actuals = FlattenArrays.flattenArrayMethod(flattenArray);
		assertArrayEquals(expecteds, actuals);
		
		Object[] nestedArray = { 4, 5, new Object[]{ 6, 2, 9}, 9, 8};
		expecteds = new Integer[]{4, 5, 6, 2, 9, 9, 8};
		actuals = FlattenArrays.flattenArrayMethod(nestedArray);
		assertArrayEquals(expecteds, actuals);
		
		Object[] nestedArray2 = { 5, new Object[]{ 3, 4, new Object[]{ 5, 6 , 6 }, 8 }, 2, 2, 3};
		expecteds = new Integer[]{5, 3, 4, 5, 6, 6, 8, 2, 2, 3};
		actuals = FlattenArrays.flattenArrayMethod(nestedArray2);
		assertArrayEquals(expecteds, actuals);
		
		Object[] nestedArray3 = { 10, new Object[]{ 90, 129, new Object[]{ 130, 250 , new Object[]{2, 860}, 7 }, 230 }, 1, 1000, 1500};
		expecteds = new Integer[]{10, 90, 129, 130, 250, 2, 860, 7, 230, 1, 1000, 1500};
		actuals = FlattenArrays.flattenArrayMethod(nestedArray3);
		assertArrayEquals(expecteds, actuals);
	}
	
}
