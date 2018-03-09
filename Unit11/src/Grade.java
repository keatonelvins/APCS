
public class Grade 
{
	private double grade;

	//add in two constructors
	public Grade()
	{
		setGrade(0);
	}
	
	public Grade(double grad)
	{
		setGrade(grad);
	}
	
	public void setGrade(double grad)
	{
		grade = grad;
	}
	
	public double getNumericGrade()
	{
		return grade;
	}
	
	public String getLetterGrade()
	{
		if(grade >= 90)
			return "A";
		if(grade >= 80)
			return "B";
		if(grade >= 70)
			return "C";
		if(grade >= 60)
			return "D";
		else
			return "F";
	}

	public String toString()
	{
		return getNumericGrade() + "\n" + getLetterGrade() + "\n";
	}
}
