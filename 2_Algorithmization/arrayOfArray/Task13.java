package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * 	Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {

	public static void main(String[] args) {

		int[][] array;

		array = new int[5][10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		// Сортируем столбцы по возрастанию;

		for (int j = 0; j < array[0].length; j++) {
			int temp = 0;
			for (int k = 1; k <= array.length; k++) {
				for (int i = 1; i < array.length; i++) {
					if (array[i - 1][j] > array[i][j]) {
						temp = array[i - 1][j];
						array[i - 1][j] = array[i][j];
						array[i][j] = temp;
					}
				}
			}
		}
		System.out.println("результат столбцы по возрастанию: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		// Сортируем строки по убыванию;
		for (int j = 0; j < array[0].length; j++) {
			int temp = 0;
			for (int k = 1; k <= array.length; k++) {
				for (int i = 1; i < array.length; i++) {
					if (array[i - 1][j] < array[i][j]) {
						temp = array[i - 1][j];
						array[i - 1][j] = array[i][j];
						array[i][j] = temp;
					}
				}
			}
		}
		System.out.println("результат столбцы по убыванию: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
