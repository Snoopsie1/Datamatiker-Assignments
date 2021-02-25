/*
2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
*/

class Main
{
  public static boolean happy = true;

  public static void main(String [] args) 
  {
     if (iAmHappy())
   
    {  
       System.out.println("I clap my hands");
    }

    else
    {
      System.out.println("I don't clap my hands"); 
    }

  sumReturn(5,2);
  capsLock("store bananer");
  firstLetterCheck("bananer");

  }
  public static boolean iAmHappy()
   {
   // fill out what is missing here:
    if (happy == true)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static Integer sumReturn (Integer number1_, Integer number2_)
  {
    Integer number1 = number1_;
    Integer number2 = number2_;
    Integer sum = number1 + number2;
    System.out.println(sum);
    return sum;
  }
  public static String capsLock (String input_)
  {
    String input = input_;
    String upperInput = input.toUpperCase();
    System.out.println(upperInput);
    return upperInput;
  }
  public static String firstLetterCheck (String input_)
  {
    var input = input_;
    var checker = input.charAt(0);
    if (Character.isUpperCase(checker))
    {
      System.out.println("The first letter is BEEG!");
    }  
    else
    {
      System.out.println("The first letter is not BEEG!");
    }
    return input;
  }
}