package by.jonline.basic.cycle.task;

//Даны два числа. Определить цифры входящие в запись обоих чисел

public class Task8 {

	public static void main(String[] args) {
		
		int a;
		int b;
		String number1;
		String number2;
		
		a = 1239;
		b = 18176534;
		
		number1 = Integer.toString(a);
		number2 = Integer.toString(b);
		
		for (int i = 0; i < number1.length(); i++) {
			for (int j = 0; j < number2.length(); j++) {
				if (number1.charAt(i) == number2.charAt(j)) {
					System.out.println(number1.charAt(i));
					break;
				}
			}
		}
		

	}

}
