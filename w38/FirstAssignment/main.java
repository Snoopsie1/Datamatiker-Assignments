/*
1.a Create a file and name it Main.java, include a main method.
1.b Write a function that prints an empty line and call it from main();
1.c Write a function that receives a string as a parameter and prints it. call this function from main()
1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
*/
class Main
{

	public static void main (String [] args)
	{
		
		emptyLine();
		theMessage("bananer");
		identity("Oliver", 22);
	}

	public static String emptyLine ()
	{
		String emptyString = "";
		System.out.println(emptyString);
		return emptyString;
	}

	public static String theMessage (String message1)
	{
		String message = message1;
		System.out.println(message);
		return message;
	}

	public static String identity (String name1, Integer age1)
	{
		String name = name1;
		Integer age = age1;
		System.out.println("My name is "+name+", I am "+age+" years old");
		return name;

	}
}