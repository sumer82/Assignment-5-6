package org.antwalk;

public class Student 
{
	private String name;
	private float engMarks;
	private float hindiMarks;
	private float mathsMarks;
	private float avg;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getEngMarks() 
	{
		return engMarks;
	}
	public void setEngMarks(float engMarks)
	{
		this.engMarks = engMarks;
	}
	public float getHindiMarks()
	{
		return hindiMarks;
	}
	public void setHindiMarks(float hindiMarks)
	{
		this.hindiMarks = hindiMarks;
	}
	public float getMathsMarks()
	{
		return mathsMarks;
	}
	public void setMathsMarks(float mathsMarks)
	{
		this.mathsMarks = mathsMarks;
	}
	public Student()
	{
		super();
	}
	public Student(String name, float engMarks, float hindiMarks, float mathsMarks)
	{
		super();
		this.name = name;
		this.engMarks = engMarks;
		this.hindiMarks = hindiMarks;
		this.mathsMarks = mathsMarks;
	}
	
	public void avgMark()
	{
		System.out.println("Calculating average marks");
		avg=((engMarks+hindiMarks+mathsMarks)/3);
	}
	
	public void showResult()
	{
		System.out.println("English Marks: "+engMarks);
		System.out.println("Hindi Marks: "+hindiMarks);
		System.out.println("Maths Marks: "+mathsMarks);
		System.out.println("Average of three subject Marks is "+avg);
	}
}
