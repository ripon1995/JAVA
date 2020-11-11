package com.rootless;

import java.util.Scanner;

public class TestGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		double mark=input.nextDouble();
		
		Grading grading=new Grading(mark);
		grading.getResult();
		
	}

}
