package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/* 	Сформировать квадратную матрицу порядка N по правилу:
 *	 A [I,J] = sin ((I^2-J^2)/N)
 * 	и подсчитать количество положительных элементов в ней.
 */

public class Task7 {

	public static void main(String[] args) {
		
		int arraySize;
		double[][] array;
		int count;
		
		arraySize = 4;
		array = new double[arraySize][arraySize];
		count = 0;
		
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j,  2)) / arraySize);
				if (array[i][j] > 0) {
					count++;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println("Количество положительных элементов равно " + count);
	}

}
