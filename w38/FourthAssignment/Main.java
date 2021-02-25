/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
*/

class Main
{
	public static void main (String [] args)
	{

	Integer [] numbers = {1337, 7, 11, 18};
	String  [] words = {"Bananer", "Yoga","Fire"};
	boolean [] questions = new boolean[1];


	System.out.println("All of our words");
	arrayOfWords(words);
	System.out.println("All of our numbers");
	arrayOfNumbers(numbers);
	System.out.println("The sum of all our numbers");
	averageOfNumbers(numbers);
	System.out.println("This sorts all of my numbers!");
	sortOfNumbers(numbers);

	}

	public static String[] arrayOfWords(String[] words) 
	{
  		for (int i = 0; i<words.length; i++) 
  		{
    		System.out.println(words[i]);
  		}
  		
  		return words;
	}

	public static Integer[] arrayOfNumbers(Integer[] numbers)
	{
		for (int i = 0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		return numbers;
	}

	public static Integer averageOfNumbers(Integer[] numbers)
	{
		Integer sum = 0;
		Integer average;

		for (int i = 0; i<numbers.length; i++)
		{
			sum += numbers[i];
		}
		average = sum / numbers.length;
		System.out.println(sum);
		System.out.println("The average of all our numbers");
		System.out.println(average);
		return average;
	}

	public static Integer sortOfNumbers(Integer[] numbers)
	{
		Integer tempNumbers = 0; 
		// For my sorting method

		for (int i = 0; i<numbers.length; i++)
		{
			for(int j = i+1; j<numbers.length; j++)
			{
				if (numbers[i]>numbers[j])
				{
					tempNumbers = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tempNumbers;
				}
			}
		}

		for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		return null;
	}
}