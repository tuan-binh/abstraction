package demo;

import java.util.Scanner;

// interface dành cho những lớp thuộc về hình học -> (Circle, Rectangle, Triangle, Square,... )
//                                                    hình tròn, hình chữ nhật, tam giác, hình vuông
public interface Shape
{
	Double getArea();
	Double getPerimeter();
	void inputData(Scanner scanner);
	void displayData();
}
