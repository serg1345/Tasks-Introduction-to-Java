package by.jonline.basic.cycle.task;

//найти сумму квадратов первых ста чисел

public class Task3 {

	public static void main(String[] args) {
		
		int result;
		
		result = 0;
		
		for (int i = 0; i <= 100; i++) {
			result = result + (int) Math.pow(i, 2);
		}
		
		System.out.println(result);			
	}

}
