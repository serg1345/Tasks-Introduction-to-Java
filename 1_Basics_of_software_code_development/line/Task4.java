package by.jonline.basic.line.task;

/*
	���� �������������� ����� R ���� nnn.ddd
	�������� ������� ������� � ����� �����
	������� ���������� �������� �����
 */
public class Task4 {

	public static void main(String[] args) {
		
		double R;
		int integerPart;
		int fractionalPart;
		double result;
		
		R = 123.456;
		integerPart = (int) R;
		fractionalPart = (int) ((R - integerPart) * 1000);
		
		result = fractionalPart + integerPart / 1000.0;
		System.out.println("���������: " + result);

	}

}
