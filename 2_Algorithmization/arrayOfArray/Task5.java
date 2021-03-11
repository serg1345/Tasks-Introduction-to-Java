package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * 	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task5 {

	public static void main(String[] args) {
	
		int[][] array;
		int arraySize;
		
		arraySize = 8;
		array = new int[arraySize][arraySize];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - i; j++) {
				array[i][j] = i + 1;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
