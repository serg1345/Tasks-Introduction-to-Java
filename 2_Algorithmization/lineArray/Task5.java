package by.jonline.algoritmization.linearray;

/*
 *	Даны целые числа а1 ,а2 ,..., аn . 
 *	Вывести на печать только те числа, для которых аi > i.
 */

public class Task5 {

	public static void main(String[] args) {
		
		int[] array;
		
		array = new int[] {8,2,0,-5,4,-10,-3,6,8,15,-2,23,18,10};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.println("a[" + i + "] = " + array[i]);
			}
		}

	}

}
