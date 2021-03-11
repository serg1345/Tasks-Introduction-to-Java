package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;
import java.util.Scanner;
/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца 
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {

	public static void main(String[] args) {

		int[][] array;
		int column1;
		int column2;
		boolean done;

		array = new int[4][3];
		done = false;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}

		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		column1 = inputNumberColumn(array[0].length, "Введите номер первого столбика ");
		do {
			column2 = inputNumberColumn(array[0].length, "Введите номер второго столбика ");
			if (column2 != column1) {
				done = true;
			} else {
				System.out.println("Номера столбиков должны быть различными");
			}
		} while (!done);

		for (int i = 0; i < array.length; i++) {
			int temp;
			temp = array[i][column1-1];
			array[i][column1-1] = array[i][column2-1];
			array[i][column2-1] = temp;
		}
		System.out.println("Результат: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	public static int inputNumberColumn(int num, String str) {

		boolean done;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;

		done = false;
		number = 0;
		while (!done) {
			System.out.print(str + "(целое число от 1 до " + num + ") >>");
			while (sc.hasNextInt() == false) {
				System.out.print(str + "(целое число от 1 до " + num + ") >>");
				sc.next();
			}
			number = sc.nextInt();
			if ((number > 0) && (number <= num)) {
				done = true;
			}
		}
		return number;
	}
}
