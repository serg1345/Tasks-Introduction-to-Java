package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * 	Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 
 */

public class Task3 {

	public static void main(String[] args) {
		
		int[][] array;
		int k;
		int p;

		array = new int[5][7];
		k = 3;
		p = 4;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println("�?сходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == k - 1) || (j == p - 1)) {
					System.out.print(array[i][j] + "  ");
				} else System.out.print("   ");
			}
			System.out.println();
		}
	}

}
