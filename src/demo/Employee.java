package demo;

public abstract class Employee
{
	private final Double RATE = 20000.0; // 20k/h
	
	public abstract Double calculateSalary();
	
	
	public Double getRATE()
	{
		return RATE;
	}
}
