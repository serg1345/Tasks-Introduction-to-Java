package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Построить магический квадрат порядка n
 */

public class Task16 {

	public static void main(String[] args) {

		int[][] magicSquare;
		int size;

		size = getNumber();
		magicSquare = null;

		if (size % 2 != 0) {
			magicSquare = method1(size); // для нечетного порядка используем индийский метод
		} else if (size % 4 == 0) {
			magicSquare = method2(size); // для четно-четного порядка используем метод Рауз-Болла
		} else {
			magicSquare = method3(size); // для четно-нечетного порядка используем метод четырех квадратов
		}

		print(magicSquare);
		System.out.println(checkMagic(magicSquare));
	}
	private static int getNumber() {
	
		boolean done;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;

		done = false;
		number = 0;
		while (!done) {
			System.out.print("Введите порядок магического квадрата (целое число не менее 3) >> ");
			while (sc.hasNextInt() == false) {
				System.out.print("Введите порядок магического квадрата (целое число не менее 3) >> ");
				sc.next();
			}
			number = sc.nextInt();
			if (number >= 3) {
				done = true;
			}
		}
		
		return number;
	}
	
	private static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	private static int[][] method1(int n) {
		int[][] array = new int[n][n];
		int i;
		int j;

		i = 0;
		j = n / 2;
		for (int cell = 1; cell <= n * n; cell++) {
			array[i][j] = cell;
			if (cell % n == 0) {
				i = i + 1;
			} else {

				if (i - 1 < 0) {
					i = i - 1 + n;
				} else
					i--;
				if (j + 1 >= n) {
					j = j + 1 - n;
				} else
					j++;
			}
		}
		return array;
	}

	private static int[][] method2(int n) {
		int number = 1;

		int[][] array = new int[n][n];
		for (int i = 0; i < n / 4; i++) {
			for (int j = 0; j < n / 4; j++) {
				for (int k = 1; k <= 4; k++) {
					array[i * 4 + (k - 1)][j * 4 + (k - 1)] = 1;
					array[i * 4 + (4 - k)][j * 4 + (k - 1)] = 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] == 1) {
					array[i][j] = number;
				} else {
					array[i][j] = n * n + 1 - number;
				}
				number++;
			}
		}
		return array;
	}

	private static int[][] method3(int n) {
		int k = n / 2;
		int temp = 0;
		int[][] arrayHelp = new int[k][k];
		int[][] array = new int[n][n];

		arrayHelp = method1(k);
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				array[i][j] = arrayHelp[i][j];
				array[i][j + k] = arrayHelp[i][j] + 2 * k * k;
				array[i + k][j] = arrayHelp[i][j] + 3 * k * k;
				array[i + k][j + k] = arrayHelp[i][j] + k * k;
			}
		}
		for (int i = 0; i < k; i++) {
			int j = 0;
			if ((i == 0) || (i == k - 1)) {
				j = 0;
			} else {
				j = 1;
			}
			temp = array[i][j];
			array[i][j] = array[i + k][j];
			array[i + k][j] = temp;
		}
		for (int h = 0; h < k - 3; h++) {
			for (int i = 0; i < k; i++) {
				temp = array[i][(3 * k - 5) / 2 - h];
				array[i][(3 * k - 5) / 2 - h] = array[i+k][(3 * k - 5) / 2 - h];
				array[i+k][(3 * k - 5) / 2 - h] = temp;
			}
		}

		return array;
	}

	private static boolean checkMagic(int[][] array) {
		int magicConst;
		int sum, sum1;

		magicConst = (array.length * (array.length * array.length + 1)) / 2;

		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				if ((j + 1 == array[i].length) && (sum != magicConst)) {
					return false;
				}
			}
		}

		for (int j = 0; j < array[0].length; j++) {
			sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i][j];
				if ((i + 1 == array.length) && (sum != magicConst)) {
					return false;
				}
			}
		}

		sum = sum1 = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i][i];
			sum1 = sum1 + array[array.length - 1 - i][i];
		}
		if ((sum != magicConst) || (sum1 != magicConst)) {
			return false;
		}

		return true;
	}
}
