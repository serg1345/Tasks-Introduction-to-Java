package by.jonline.basic.cycle.task;

//вычислить значения функции на отрезке [a,b] с шагом h

public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double y;

		a = -0.8;
		b = 2.7;
		h = 0.1;

		while (a <= b) {
			if (a <= 2) {
				y = -a;
			} else {
				y = a;
			}
			System.out.println("y(" + String.format("%.3f", a) + ") = " + String.format("%.3f", y));
			a = a + h;
		}

	}

}
