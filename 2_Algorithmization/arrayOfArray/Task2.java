package by.jonline.algoritmization.arrayarray;

/*
 * 	Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

		int[][] array;
		int arraySize;

		arraySize = 5;
		array = new int[arraySize][arraySize];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println("�?сходная матрица: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		System.out.println("Запрошенные в задаче данные: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == j) ||(i + j == array.length - 1)) {
					System.out.print(array[i][j] + "  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
