package demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle implements Shape
{
	private double radius;
	
	public Circle()
	{
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public Double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	@Override
	public Double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	@Override
	public void inputData(Scanner scanner)
	{
		System.out.println("Nhập vào bán kính: ");
		radius = Double.parseDouble(scanner.nextLine());
	}
	
	@Override
	public void displayData()
	{
//		System.out.println("Bán kính: "+ this.radius + " Area = "+ getArea() +" Perimeter = "+getPerimeter());
		System.out.printf("Bán kình : %.2f | Area : %.2f | Perimeter : %.2f\n", radius, getArea(), getPerimeter());
	}
}
