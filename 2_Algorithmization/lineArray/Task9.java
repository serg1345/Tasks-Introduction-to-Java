package by.jonline.algoritmization.linearray;

/*
 * 	В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * 	Если таких чисел несколько, то определить наименьшее из них.
 */
import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {

		int sizeArray;
		int[] array;
		int[] array2;
		int number;
		int maxRepeat;
		int element;
		boolean repeat;

		sizeArray = 40;
		array = new int[sizeArray];
		array2 = new int[sizeArray];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 11) - 5;
		}
		System.out.println(Arrays.toString(array));

		//посчитаем количество повторов повторяющихся элементов.
		for (int i = 0; i < array.length; i++) {
			number = 0;
			for (int j = 0; j < array.length; j++) {
				if (i != 0) {
					repeat = false;
					for (int k = 0; k < i; k++) {
						if (array[i] == array[k]) {
							repeat = true;
						}
					}
					if (repeat) {
						continue;
					}
				}
				if (array[i] == array[j]) {
					number = number + 1;
				}
			}
			if (number != 0) {
				System.out.println(array[i] + " встречается " + number + " раз.");				
			}
			array2[i] = number;//в ячейку 2-ого массива записываем к-во повторов элемента 1-го массива либо 0 если это число уже было посчитано
		}
		
		// Найдем число с максимальным количеством повторов
		maxRepeat = array2[0];
		element = array[0];
		for (int i = 1; i < array2.length; i++) {
			if (array2[i] == 0) {
				continue;
			}
			if (array2[i] > maxRepeat) {
				maxRepeat = array2[i];
				element = array[i];
			}
		}
		
		//Если чисел с максимальным количеством повторов несколько выберем наименьшее из них
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == 0) {
				continue;
			}
			if (array2[i] == maxRepeat) {
				if (array[i] < element) {
					element = array[i];
				}
			}
		}
		System.out.println("Искомое число: " + element);
	}

}
