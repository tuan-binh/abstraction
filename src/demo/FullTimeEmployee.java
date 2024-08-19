package demo;

public class FullTimeEmployee extends Employee
{
	@Override
	public Double calculateSalary()
	{
		return 8 * super.getRATE();
	}
}
