package by.jonline.basic.cycle.task;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид: (1/2^n) + (1/3^n)
 */

public class Task5 {

	public static void main(String[] args) {
	
		int n;
		double e;
		double a;
		double sum;
		boolean done;
		
		e = 0.001;
		
		sum = 0;
		done = false;
		n = 1;
		
		do {
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (Math.abs(a) >= e) {
				sum = sum + a;
				n++;
			} else {
				done = true;
			}
		} while (done == false);
		
		System.out.printf("Сумма членов ряда, модуль которых больше или равен заданному е="
                			+ e + ", равна %.8f", sum);
	}

}
