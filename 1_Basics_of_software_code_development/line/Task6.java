package by.jonline.basic.line.task;

/*
 * ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� �����
 * � ������������ (�,�) ����������� ����������� ������� � false � ��������� ������.
 */
public class Task6 {

	public static void main(String[] args) {

		double x;
		double y;
		boolean result;

		x = -4.5;
		y = -2.9;
		result = false;

		if (((y > 0) & (y <= 4)) & ((x >= -2) & (x <= 2))) {
			result = true;
		}
		if (((y <= 0) & (y >= -3)) & ((x >= -4) & (x <= 4))) {
			result = true;
		}

		System.out.println(result);
	}

}
