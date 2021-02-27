package by.jonline.basic.branching.task;

// Даны координаты трех точек. Определить принадлежат ли они одной прямой

public class Task3 {

	public static void main(String[] args) {
		
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		
		x1 = 2;
		y1 = 3;
		x2 = 4;
		y2 = 5;
		x3 = 6;
		y3 = 7;
		
		if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
			System.out.println("Точки принадлежат одной прямой");
		} else {
			System.out.println("Точки не принадлежат одной прямой");
		}

	}

}
