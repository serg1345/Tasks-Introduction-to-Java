package by.jonline.basic.line.task;

/*
	Дано действительное число R вида nnn.ddd
	Поменять местами дробную и целую части
	Вывести полученное значение числа
 */
public class Task4 {

	public static void main(String[] args) {
		
		double R;
		int integerPart;
		int fractionalPart;
		double result;
		
		R = 123.456;
		integerPart = (int) R;
		fractionalPart = (int) ((R - integerPart) * 1000);
		
		result = fractionalPart + integerPart / 1000.0;
		System.out.println("Результат: " + result);

	}

}
