package by.jonline.basic.cycle.task;

// Пользователь вводит целое положительное число
// Программа суммирует все числа от 1 до введенного

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan;
		int a;
		int counter;
		int sum;
		boolean done;

		a = 0;
		sum = 0;
		scan = new Scanner(System.in);
		done = false;

		while (!done) {
			System.out.print("Введите целое положительное число: ");
			while (!scan.hasNextInt()) {
				System.out.println("Вы ввели не целое число");
				System.out.print("Введите целое положительное число: ");
				scan.next();
			}
			a = scan.nextInt();
			if (a > 0) {
				done = true;
			} else {
				System.out.println("Вы ввели не положительное число");
			}
		}

		for (counter = 1; counter <= a; counter++) {
			sum = sum + counter;
		}
		System.out.println("Сумма целых от 1 до " + a + " = " + sum);
	}
}
