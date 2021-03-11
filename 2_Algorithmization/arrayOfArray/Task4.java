package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * 	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task4 {

	public static void main(String[] args) {
	
		int[][] array;
		int arraySize;
		
		arraySize = 8;
		array = new int[arraySize][arraySize];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i % 2 == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = array.length - j;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
