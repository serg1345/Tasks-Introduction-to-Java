package by.jonline.algoritmization.arrayarray;

/*
 * 	Дана матрица. Вывести на экран все нечетные столбцы, 
 * 	у которых первый элемент больше последнего. 
 */
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int[][] array;
		boolean done;

		array = new int[7][7];
		done = false;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println("�?сходный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		System.out.println("Запрошенные в задаче данные: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j += 2) {
				if (array[0][j] > array[array.length - 1][j]) {
					System.out.print(array[i][j] + ", ");
					done = true;
				}
			}
			System.out.println();
		}
		if (!done) {
			System.out.println("В исходной матрице запрошенных столбцов не существует");
		}
	}

}
