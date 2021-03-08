package by.jonline.algoritmization.linearray;

/*	
 * 	Даны действительные числа a1,a2,...,an . 
 * 	Найти max(a1 + a2,a2 + a3,...,an-1 + an) .
 */

public class Task7 {

	public static void main(String[] args) {

		int arraySize;
		double[] array;
		double maxSum;

		arraySize = 10;
		array = new double[arraySize];

		// заполним массив псевдослучайными действительными числами в интервале (-10;10)
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 20 - 10;
			System.out.println(array[i]);
		}

		maxSum = array[0] + array[1];
		for (int i = 2; i < array.length; i++) {
			if ((array[i - 1] + array[i]) > maxSum) {
				maxSum = array[i - 1] + array[i];
			}
		}
		System.out.println("Искомая величина равна " + maxSum);
	}

}
