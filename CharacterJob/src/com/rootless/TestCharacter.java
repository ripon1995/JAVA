package com.rootless;

import java.util.Scanner;

public class TestCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int tc=input.nextInt();
		
		for(int i=1;i<=tc;i++)
		{
			char ch=input.next().charAt(0);
			
			CharacterFinding chFind=new CharacterFinding(ch);
			
			chFind.find();
		}
		
		
		
	}

}
