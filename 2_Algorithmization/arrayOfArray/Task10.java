package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * 	Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {

	public static void main(String[] args) {

		double[][] array;
		int sizeArray;

		sizeArray = 7;
		array = new double[sizeArray][sizeArray];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (((int) (Math.random() * 2000)) - 1000) / 100.0;
			}
		}
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		System.out.println("Искомые значения : ");
		for (int i = 0, j = 0; i < array.length; i++, j++) {
			if (array[i][j] > 0) {
				System.out.print(array[i][j] + ", ");
			}
		}

	}

}
