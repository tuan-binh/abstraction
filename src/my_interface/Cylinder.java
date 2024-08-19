package my_interface;

import demo.Circle;
import demo.Employee;

public class Cylinder extends Circle implements Shape3D
{
	//
	
	@Override
	public Double getVolume()
	{
		return 0.0;
	}
	
	@Override
	public Double getArea()
	{
		return 0.0;
	}
	
	@Override
	public Double getPerimeter()
	{
		return 0.0;
	}
}
