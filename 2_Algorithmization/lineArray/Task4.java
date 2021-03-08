package by.jonline.algoritmization.linearray;

/*
 * 	Даны действительные числа а1 ,а2 ,..., аn . 
 * 	Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {

	public static void main(String[] args) {
		
		int arraySize;
		double[] array;
		double min;
		double max;
		int indexMin;
		int indexMax;

		arraySize = 10;
		array = new double[arraySize];

		// заполним массив псевдослучайными действительными числами в интервале (-10;10)
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 20 - 10;
//			System.out.println(array[i]);
		}
		
		//найдем индексы минимального и максимального элемента массива
		min = array[0];
		max = array[0];
		indexMin = 0;
		indexMax = 0;
		for (int i = 1; i <array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				indexMin = i;
			}
			if (array[i] > max) {
				max = array[i];
				indexMax = i;
			}
		}
		System.out.println("До замены: ");
		System.out.println("a[" + indexMin + "] = " + array[indexMin]);
		System.out.println("a[" + indexMax + "] = " + array[indexMax]);		
		
		//поменяем местами минимальный и максимальный элементы
		array[indexMax] = min;
		array[indexMin] = max;
		
		System.out.println("После замены:");
		System.out.println("a[" + indexMin + "] = " + array[indexMin]);
		System.out.println("a[" + indexMax + "] = " + array[indexMax]);				

	}

}
