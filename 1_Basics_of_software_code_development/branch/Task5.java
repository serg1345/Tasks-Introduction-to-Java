package by.jonline.basic.branching.task;

//Вычислите значение функции

public class Task5 {

	public static void main(String[] args) {

		double x;
		double result;

		x = 4;

		if (x <= 3) {
			result = Math.pow(x, 2) - 3 * x + 9;
		} else {
			result = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("F(x) = " + result);
	}

}
