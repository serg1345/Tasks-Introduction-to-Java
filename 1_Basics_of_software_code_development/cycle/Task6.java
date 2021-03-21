package by.jonline.basic.cycle.task;

//Вывести на экран соответствие между символами иих численными обозначениями

public class Task6 {

	public static void main(String[] args) {

		char symb;
		
		for (symb = 0; symb < 65535; symb++) {
			System.out.println((int)symb + " = " + symb);
		}

	}

}
