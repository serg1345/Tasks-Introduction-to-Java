package by.jonline.basic.cycle.task;

/*
 * для каждого натурального числа в промежутке от m до n вывести все делители кроме единицы и самого числа
 * m и n вводятся с клавиатуры
 */

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int m;
		int n;

		do {
			System.out.print("Введите положительное целое число m >>");
			while (!sc.hasNextInt()) {
				System.out.print("это не целое число!");
				sc.next();
			}
			m = sc.nextInt();
			if (m > 0) {
				System.out.println("Cпасибо!. m = " + m);
			} else
				m = -1;
		} while (m <= 0);

		do {
			System.out.print("Введите положительное целое число n, большее чем " + m + " >>");
			while (!sc.hasNextInt()) {
				System.out.print("это не целое число!");
				sc.next();
			}
			n = sc.nextInt();
			if ((n > 0) && ((n - m) > 1)) {
				System.out.println("Cпасибо!. n = " + n);
			} else
				n = -1;
		} while (n <= 0);

		for (m = m + 1; m < n; m++) {
			System.out.print("Делители числа " + m + ": ");
			for (int i = 2; i < m; i++) {
				if ((m % i) == 0) {
					System.out.print(i + ", ");
				}
			}
			System.out.println("---");
		}

	}

}
