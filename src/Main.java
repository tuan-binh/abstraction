import demo.*;

import java.util.Date;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// 1. abstract class
		// OT overtime
		/**
		 * lớp Employee chung có phương thức abstract là tính lương là calculateSalary() và có hệ sô lương là 20k/h
		 * có 2 lớp là FullTimeEmployee và PartTimeEmployee đều là lớp con của Employee
		 * riêng lớp fulltime mặc định là 8 tiếng làm
		 * lớp parttime là có thêm trường là workingHours
		 * */
		
		Employee employeeFull = new FullTimeEmployee();
		Employee employeePart = new PartTimeEmployee();
		
//		Object[] arr =new Object[100];
//
//		arr[0]=employeeFull;
//		arr[1]=employeePart;
//
//		Date date = new Date();
//		arr[2]=date;
		
		
		( (PartTimeEmployee) employeePart).setWorkingHours(5.0);
		
//		if(employeePart instanceof PartTimeEmployee) {
//			((PartTimeEmployee) employeePart).setWorkingHours(5.0); // vì employeePart đang là Employee -> phải ép kiểu sang PartTimeEmployee
//		}
		
		System.out.println("Lương fulltime = "+employeeFull.calculateSalary());
		System.out.println("Lương parttime = "+employeePart.calculateSalary());
		
		Scanner scanner = new Scanner(System.in);
		Circle circle = new Circle();
		circle.inputData(scanner);
		circle.displayData();
	}
}