package by.jonline.algoritmization.linearray;

/*
 * 	Задана последовательность N вещественных чисел. 
 * 	Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task6 {

	public static void main(String[] args) {
		
		int arraySize;
		double[] array;
		boolean simple;
		double sum;

		arraySize = 100;
		array = new double[arraySize];
		sum = 0;

		// заполним массив псевдослучайными действительными числами в интервале (-10;10)
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 20 - 10;
//			System.out.println(array[i]);
		}

		// Найдем сумму чисел, индексы которых являются простыми числами
		for (int i = 2; i < array.length; i++) {
			simple = true;
			for (int j = 2; j < i; j++) {
				if ((i != j) && (i % j == 0)) {
					simple = false;
				}
			}
			if (simple) {
				sum = sum + array[i];
//				System.out.print(i +"; ");
				System.out.println("a[" + i + "] = " + array[i]);
			}
		}
		System.out.println("Искомая сумма равна " + sum);
	}

}
