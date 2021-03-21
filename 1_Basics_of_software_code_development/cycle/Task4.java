package by.jonline.basic.cycle.task;

//найти произведение квадратов первых 100 чисел

public class Task4 {

	public static void main(String[] args) {
		
		long result;
		
		result = 1;
		int i = 1;
		
		for (; i <= 100; i++) {
			if (result * (i * i) < result) {
				System.out.println("!!! Переполнение !!!. для i > " + (i - 1) + " в примитивных типах данных задача не решаема" );
				break;
			}
			result = result * (i * i);
//			System.out.println(i + " = " + result);
		}
		
		System.out.println("Произведение квадратов первых " + (i-1) + " чисел равна " + result);			
	}

}
