package by.jonline.algoritmization.linearray;

/*
 *	Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 *	Заменить все ее члены, большие данного Z, этим числом. 
 *	Подсчитать количество замен
 */

public class Task2 {

	public static void main(String[] args) {
		
		int sizeArray;
		int max;
		int[] array;
		int counter;
		
		sizeArray = 10;
		max = 50;
		array = new int[sizeArray];
		counter = 0;
		
		for (int i = 0; i < sizeArray; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " >> ");
			if (array[i] > max) {
				array[i] = max;
				counter++;
			}
			System.out.println(array[i]);
		}
		System.out.println("Количество замен = " +   counter);
	}

}
