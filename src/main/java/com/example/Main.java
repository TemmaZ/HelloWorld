package com.example;

class Main
{
	public static void main(String... strings)
	{
		System.out.println(Main.class);
		int count = Integer.valueOf(strings[0]);
		String text = "Hello World";
		for (int index = 0; index < count; ++index)
		{
			System.out.println(String.format("%d - %s - %s", index, text, strings[1]));
		}
	}
}
