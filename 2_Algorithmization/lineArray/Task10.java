package by.jonline.algoritmization.linearray;

/*
 * Дан целочисленный массив с количеством элементов п. 
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать.
 */
import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		
		int sizeArray;
		int[] array;

		sizeArray = 10;
		array = new int[sizeArray];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 11) - 5;
		}
		System.out.println(Arrays.toString(array));	
		
		for (int i = 2; i < array.length; i = i + 2) {
			array[i/2] = array[i];

		}
		for (int i = (int) Math.round(array.length / 2.0); i < array.length; i++) {
			array[i] = 0;
		}
		System.out.println(Arrays.toString(array));
	}

}
