package it.techgap.flatten;

import java.util.ArrayList;
import java.util.List;

public class FlattenArrays {

	private static List<Integer> list;
	
	public static Integer[] flattenArrayMethod(Object[] nestedArray) {
		Integer[] flattenedArray = null;
		if (nestedArray != null) {
			if (nestedArray.length > 0) {
				list = new ArrayList<>();
				flattenArray(nestedArray);
				flattenedArray = new Integer[list.size()];
				for (int i=0;i<list.size();i++) {
					flattenedArray[i] = list.get(i);
				}
				return flattenedArray;
			}
			return new Integer[0];
		}
		return null;
	}
	
	private static void flattenArray(Object[] nestedArray) {
		for (Object obj : nestedArray) {
			if (obj instanceof Integer) {
				list.add(Integer.parseInt(obj.toString()));
			} else if (obj instanceof Object[]) {
				flattenArray((Object[]) obj);
			}
		}
	}
	
}
