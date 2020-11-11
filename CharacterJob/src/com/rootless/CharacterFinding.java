package com.rootless;

public class CharacterFinding {
	
	private char ch;
	
	public CharacterFinding(char c)
	{
		this.ch=c;
	}
	
	public void find()
	{
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is a digit");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.print(ch+" is an Alphabet");
			if(ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			{
				System.out.println(" : "+ch+" is a vowel");
			}
			else
			{
				System.out.println(" : "+ch+" is a consonant");
			}
		}
		else
		{
			System.out.println(ch+" is a special character");
		}
	}

}
