package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 *  Найдите наибольший элемент матрицы и 
 *  заменить все нечетные элементы на него.
 */

public class Task15 {

	public static void main(String[] args) {

		int[][] array;
		int max;

		array = new int[5][10];
		max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		//ищем максимальный элемент
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				};
			}
		}		
		//заменяем нечетные элементы на найденный максимальный элемент
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = max;
				}
			}
		}
		System.out.println("Результирующий массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

}
