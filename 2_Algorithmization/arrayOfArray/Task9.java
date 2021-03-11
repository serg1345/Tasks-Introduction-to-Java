package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 *	Задана матрица неотрицательных чисел. 
 *	Посчитать сумму элементов в каждом столбце. 
 *	Определить, какой столбец содержит максимальную сумму. 
 */

public class Task9 {

	public static void main(String[] args) {

		int[][] array;
		int max;
		int sum;
		int numberMaxColumn;

		array = new int[3][10];
		max = 0;
		numberMaxColumn = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
		
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		for (int j = 0; j < array[0].length; j++) {
			sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i][j];
			}
			System.out.print(sum + " ");
			if (sum > max) {
				max = sum;
				numberMaxColumn = j;
			}
		}
		
		System.out.println(". Максимальная сумма у столбца " + (numberMaxColumn + 1));
		
	}

}
