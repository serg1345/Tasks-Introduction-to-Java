package by.jonline.basic.line.task;
/*
 Дано натуральное число Т в секундах
 Вывести данное число в часах, минутах и секундах
 */

public class Task5 {

	public static void main(String[] args) {

		int T;
		int hours;
		int minutes;
		int seconds;

		T = 7199;

		hours = T / 60 / 60;
		minutes = (T - hours * 60 * 60) / 60;
		seconds = T - hours * 60 * 60 - minutes * 60;

		System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");
	}

}
