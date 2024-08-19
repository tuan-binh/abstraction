package demo;

public class PartTimeEmployee extends Employee
{
	private Double workingHours;
	
	public PartTimeEmployee()
	{
	}
	
	public PartTimeEmployee(Double workingHours)
	{
		this.workingHours = workingHours;
	}
	
	@Override
	public Double calculateSalary()
	{
		return this.workingHours * super.getRATE();
	}
	
	public Double getWorkingHours()
	{
		return workingHours;
	}
	
	public void setWorkingHours(Double workingHours)
	{
		this.workingHours = workingHours;
	}
}
