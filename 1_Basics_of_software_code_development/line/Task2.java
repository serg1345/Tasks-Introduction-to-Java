package by.jonline.basic.line.task;

// вычислить значение уравнения по формуле
public class Task2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;
		
		a = 2.1;
		b = 3.2;
		c = 4.3;
		
		result = (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
		System.out.println("Результат: "+result);
	}

}
