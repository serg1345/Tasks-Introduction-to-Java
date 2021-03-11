package by.jonline.algoritmization.arrayarray;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, 
 * в которых число 5 встречается три и более раз.
 */
public class Task11 {

	public static void main(String[] args) {

		int[][] array;
		int numberOfLines;

		array = new int[10][20];
		numberOfLines = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 15);
			}
		}
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.print("Номера строк в которых 5 встречается 3 и более раз: ");
		for (int i = 0; i < array.length; i++) {
			int tempCount = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5) {
					tempCount++;
				}
			}
			if (tempCount >= 3) {
				numberOfLines++;
				System.out.print((i + 1) + ", ");
			}
		}
		if (numberOfLines == 0) {
			System.out.print(" отсутствуют");
		}
	}

}
