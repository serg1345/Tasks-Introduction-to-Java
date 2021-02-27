package by.jonline.basic.branching.task;

// Даны размеры А и В прямоугольного отверстия и размеры кирпича x,y,z 
// Определить пройдет ли кирпич в отверстие.

public class Task4 {

	public static void main(String[] args) {

		int A;
		int B;
		int x;
		int y;
		int z;
		int min1;
		int min2;

		A = 4;
		B = 7;
		x = 20;
		y = 7;
		z = 3;

		// найдем меньшие метрики кирпича для дальнейшего сравнения с размерами
		// отверстия
		if ((x <= y) & (x <= z)) {
			min1 = x;
			if (y <= z) {
				min2 = y;
			} else {
				min2 = z;
			}
		} else {
			min1 = y;
			min2 = z;
		}

		// сравним меньшие размеры кирпича с размерами отверстия
		if (((min1 <= A) & (min2 <= B)) | ((min1 <= B) & (min2 <= A))) {
			System.out.println("Кирпич пройдет");
		} else {
			System.out.println("Кирпич не пройдет");
		}
	}
}
