package by.jonline.algoritmization.arrayarray;

import java.util.Arrays;

/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task14 {

	public static void main(String[] args) {

		int[][] array;
		boolean done;

		array = new int[8][5]; //КОЛИЧЕСТВО СТРОК ДОЛЖНО БЫТЬ БОЛЬШЕ КОЛИЧЕСТВА СТОЛБЦОВ
		
		for (int j = 0; j < array[0].length; j++) {
			for (int k = 1; k <= j + 1; k++) {
				int i;
				done = false;				
				while (!done) {
					i = (int) (Math.random() * array.length);
					if (array[i][j] == 0 ) {
						array[i][j] = 1;
						done = true;
					};
				}
			}
		}
		System.out.println("результат : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

}
