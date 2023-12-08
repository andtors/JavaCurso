package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		//Este metodo t irá trabalhar com qualquer tipo de t desde que ele seja qualquer tipo de comparable T
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
				//Lógica para encontrar o maior valor na lista
			}
		}
		return max;
	}
}