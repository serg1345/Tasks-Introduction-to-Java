package by.jonline.basic.line.task;

//��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������)

public class Task3 {

	public static void main(String[] args) {

		double x;
		double y;
		double result;

		x = 1.5;
		y = 6.85;

		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("���������: " + result);
	}

}
