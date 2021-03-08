package by.jonline.algoritmization.linearray;

/*
 *	Дан массив действительных чисел, размерность которого N. 
 *	Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 
 */
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int arraySize;
		double[] array;
		int countPositiv;
		int countNegativ;
		int countNull;
		boolean done;

		arraySize = 0;
		countNegativ = 0;
		countPositiv = 0;
		countNull = 0;
		done = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!done) {
			System.out.print("Введите размерность массива (целое положительное число) >>");
			while (sc.hasNextInt() == false) {
				System.out.print("Введите размерность массива (целое положительное число) >>");
				sc.next();
			}
			arraySize = sc.nextInt();
			if (arraySize > 0) {
				done = true;
			}
		}

		array = new double[arraySize];

		// заполним массив псевдослучайными действительными числами в интервале (-10;10)
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 20 - 10;
		//	System.out.println(array[i]);
		}

		for (double element : array) {
			if (element > 0) {
				countPositiv++;
			} else if (element < 0) {
				countNegativ++;
			} else {
				countNull++;
			}
		}
		System.out.println("Положительных - " + countPositiv);
		System.out.println("Отрицательных - " + countNegativ);
		System.out.println("Нулевых - " + countNull);
	}

}
