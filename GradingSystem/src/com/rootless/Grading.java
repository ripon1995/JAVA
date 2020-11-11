package com.rootless;

public class Grading {
	
	private double marks;

	public Grading(double marks) {
		this.marks = marks;
	}
	
	public void getResult()
	{
		if(marks>=80)
		{
			System.out.println("Grade: A+");
			System.out.println("Grade point Equivalent: 4.00");
			System.out.println("Remarks: Outstanding");
		}
		else if(marks>=75 && marks<80)
		{
			System.out.println("Grade: A");
			System.out.println("Grade point Equivalent: 3.75");
			System.out.println("Remarks: Excellent");
		}
		if(marks>=70 && marks<75)
		{
			System.out.println("Grade: A-");
			System.out.println("Grade point Equivalent: 3.50");
			System.out.println("Remarks: Very Good");
		}
		if(marks>=65 && marks<70)
		{
			System.out.println("Grade: B+");
			System.out.println("Grade point Equivalent: 3.25");
			System.out.println("Remarks: Good");
		}
		if(marks>=60 && marks<65)
		{
			System.out.println("Grade: B");
			System.out.println("Grade point Equivalent: 3.00");
			System.out.println("Remarks: Satisfactory");
		}
		if(marks>=55 && marks<60)
		{
			System.out.println("Grade: B-");
			System.out.println("Grade point Equivalent: 2.75");
			System.out.println("Remarks: Above Average");
		}
		if(marks>=50 && marks <55)
		{
			System.out.println("Grade: C+");
			System.out.println("Grade point Equivalent: 2.50");
			System.out.println("Remarks: Average");
		}
		if(marks>=45 && marks<50)
		{
			System.out.println("Grade: C");
			System.out.println("Grade point Equivalent: 2.25");
			System.out.println("Remarks: Below Average");
		}
		if(marks>=40 && marks<45)
		{
			System.out.println("Grade: D");
			System.out.println("Grade point Equivalent: 2.00");
			System.out.println("Remarks: Pass");
		}
		if(marks<40)
		{
			System.out.println("Grade: F");
			System.out.println("Grade point Equivalent: 0.00");
			System.out.println("Remarks: Fail");
		}
	}
	

}
