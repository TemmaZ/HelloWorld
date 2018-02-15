package com.example;

class Main
{
	public static void main(String... strings)
	{
		System.out.println(Main.class);
		int count = 50;
		String text = "Hello World";
		for(int index = 0; index < count; ++index)
		{
			System.out.println(String.format("%d - %s", index, text));
		}
	}
}
