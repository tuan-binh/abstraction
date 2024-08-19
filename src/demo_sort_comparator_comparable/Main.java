package demo_sort_comparator_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main
{
	static Student[] students = new Student[9];
	static {
		students[0] = new Student("Ngọc",23);
		students[1] = new Student("Hùng",23);
		students[2] = new Student("Hưởng",21);
		students[3] = new Student("Linh",41);
		students[4] = new Student("Yến",18);
		students[5] = new Student("Nghĩa",30);
		students[6] = new Student("Dương",15);
		students[7] = new Student("Minh",50);
		students[8] = new Student("Huỳnh",18);
	}
	public static void main(String[] args)
	{
		// Comparator
		
		// Comparable - sử dụng trong class
		// reference method
		System.out.println("Array trước khi sort = "+ Arrays.toString(students));
		Arrays.sort(students,Comparator.comparingInt(Student::getAge));
		System.out.println("Array sau khi sort = "+ Arrays.toString(students));
		Arrays.sort(students,Comparator.comparing(Student::getFullName));
		System.out.println("Array sau khi sort = "+ Arrays.toString(students));
	}
}
