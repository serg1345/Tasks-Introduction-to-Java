package by.jonline.basic.line.task;
/*
 ���� ����������� ����� � � ��������
 ������� ������ ����� � �����, ������� � ��������
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

		System.out.println(hours + "� " + minutes + "��� " + seconds + "c");
	}

}
