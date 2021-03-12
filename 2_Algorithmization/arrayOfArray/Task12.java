package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class Task12 {

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

		// Сортируем строки по возрастанию;

		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			for (int k = 1; k <= array[i].length; k++) {
				for (int j = 1; j < array[i].length; j++) {
					if (array[i][j - 1] > array[i][j]) {
						temp = array[i][j - 1];
						array[i][j - 1] = array[i][j];
						array[i][j] = temp;
					}
				}
			}
		}
		System.out.println("результат строки по возрастанию: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}	
		
		
		// Сортируем строки по убыванию;
		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			for (int k = 1; k <= array[i].length; k++) {
				for (int j = 1; j < array[i].length; j++) {
					if (array[i][j - 1] < array[i][j]) {
						temp = array[i][j - 1];
						array[i][j - 1] = array[i][j];
						array[i][j] = temp;
					}
				}
			}
		}
		System.out.println("результат строки по убыванию: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}		

	}

}
