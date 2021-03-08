package by.jonline.algoritmization.linearray;

/*
 *	Дана последовательность целых чисел a1,a2,..an. 
 *	Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,..,an). 
 */
import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {

		int[] array;
		int[] array2;
		int min;
		int quantityMin;

		array = new int[] { -10, 2, 0, -5, 4, -10, -3, 6, 8, 15, -2, 23, 18, 10, -10, 0 };
		min = array[0];
		quantityMin = 1;

		// Найдем минимальный элемент массива и количество таких элементов
		for (int i = 1; i < array.length; i++) {
			if (array[i] == min) {
				quantityMin = quantityMin + 1;
			}
			if (array[i] < min) {
				min = array[i];
				quantityMin = 1;
			}
		}
		System.out.println(min + "; " + quantityMin);

		// создаем новый массив с необходимым количеством элементов и заполняем его по
		// условию задачи
		array2 = new int[array.length - quantityMin];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != min) {
				array2[j] = array[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));

	}

}
