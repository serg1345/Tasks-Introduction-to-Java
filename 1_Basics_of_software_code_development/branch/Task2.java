package by.jonline.basic.branching.task;

// Найти max(min(a,b);min(c,d))

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int min1;
		int min2;
		int max;

		a = -3;
		b = 1;
		c = -5;
		d = -8;

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}
		
		System.out.println("Результат: " + max);
	}

}
