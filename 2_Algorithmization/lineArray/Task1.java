package by.jonline.algoritmization.linearray;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 

public class Task1 {

	public static void main(String[] args) {
		
		int sizeArray;
		int divider;
		int[] array;
		int sum;
		
		sizeArray = 5;
		divider = 2;
		array = new int[sizeArray];
		sum = 0;
		
		for (int i = 0; i < sizeArray; i++) {
			array[i] = (int) (Math.random() * 1000);
			if (array[i] % divider == 0) {
				sum += array[i];
			}
		}
		System.out.println("Сумма элементов массива кратных " + divider + " = " + sum);
	}

}
