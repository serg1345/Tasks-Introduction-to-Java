package by.jonline.basic.branching.task;

/*
 * ���� ��� ���� ������������ � ��������.
 * ���������� ���������� �� ����� �����������.
 * ���� ��, �� �������� �� �� �������������.
 */
public class Task1 {

	public static void main(String[] args) {

		int angle1;
		int angle2;
		int angle3;

		angle1 = 45;
		angle2 = 45;

		angle3 = 180 - (angle1 + angle2);
		if (angle3 <= 0) {
			System.out.println("����� ����������� �� ����������");
		} else {
			System.out.print("����� ����������� ����������. ");
			if ((angle1 == 90) | (angle2 == 90) | (angle3 == 90)) {
				System.out.println("�� �������������.");
			} else {
				System.out.println("�� �� �������������.");
			}
		}
	}

}
