package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * 	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task6 {

	public static void main(String[] args) {

		int[][] array;
		int arraySize;

		arraySize = 10;
		array = new int[arraySize][arraySize];

		for (int i = 0; i < array.length; i++) {
			if (i < arraySize / 2) {
				for (int j = 0 + i; j < array[i].length - i; j++) {
					array[i][j] = 1;
				}
			} else {
				for (int j = arraySize - 1 - i; j <=  i; j++) {
					array[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
