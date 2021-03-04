import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        int i = 0;

        while(scan.hasNextLine())
        {
            text[i] = scan.nextLine().split(" ");
            System.out.println(text[i].length);
            i++;
        }
        //todo: Make a method that prints words that starts with a given word.
        printWordsStartingWith("Ø");
        //todo: Make a method that prints words that has a given length.
        printWordsOfLength(3);
        //todo: Make a method that prints double consonants.
        printWordsWithDoubleConsonant();
        //todo: Print the longest sentence in the text.
        printLongestSentence();
        //todo: Print a part (substring) of a word.
        printPartOfWord("København", -1,12);
        //todo: Print a word if it's a palindrome.
        printIfPalindrome("abu");

    }

    // Task 4
    private static void printIfPalindrome(String word)
    {
        System.out.println("-------------------- Task 4 --------------------");
        String input = word;
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--)   // Fills the empty "reverse" String, with the content of "input"
        {                                               // But in reverse.
            reverse = reverse + input.charAt(i);        // So last letter in Input = first letter in Reverse etc.
        }

        if (input.equals(reverse))
        {
            System.out.println("\nYour word is a palindrome!");
        }
        else
        {
            System.out.println("\nYour word is not a palindrome!");
        }
    }

    // Task 3
    private static void printPartOfWord(String word,int index,int length)
    {
        System.out.println("-------------------- Task 3 --------------------");
        try {
            System.out.println("Printing a part of the word : " + word);
            System.out.println("Here is a part of the word :" + word.substring(index, length));
        } catch (StringIndexOutOfBoundsException ex)
        {
            System.out.println("Parameters are invalid, try again");
        }
    }

    // Task 2
    private static void printLongestSentence() throws FileNotFoundException
    {
        System.out.println("-------------------- Task 2 --------------------");
        System.out.println("Here is the longest sentence");
        String[] splitArray;
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        String longestSentence = "";

        int i = 0;
        while(scan.hasNextLine())
        {

            // Prints all sentences, with "." as regex. with a length counter on the left side.
            splitArray = scan.nextLine().split("\\.");
            System.out.println(splitArray[i].length()+"    :    "+splitArray[i]);
            // If-loop that assigns "LongestSentence"'s value to what the longest sentence is.
            if (longestSentence.length() < splitArray[i].length())
            {
                longestSentence = splitArray[i];
            }
        }

        System.out.println("The longest sentence is this one :");
        System.out.println(longestSentence);

    }

    // Task 1, ikke den løsning du bedte om, men what the heck :D
    private static void checksWordsWithConsonants(String word)
    {
        String[] doubleConsonants =
                {"bb","cc","dd","ff","gg","hh","jj","kk","ll","mm",
                        "nn","pp","qq","rr","ss","tt","vv","ww","xx","zz"};

            for (int i = 0; i < doubleConsonants.length; i++)
            {
                if (word.contains(doubleConsonants[i]))
                {
                    System.out.println(word);
                }
            }
    }

    // En del af task 1.
    private static void printWordsWithDoubleConsonant()
    {
        System.out.println("-------------------- Task 1 --------------------");
        System.out.println("Here is a list of all the Double Consonants: ");
        for (int i = 0; i < text.length; i++)
        {
            for (String s:text[i])
            {
                checksWordsWithConsonants(s);
            }
        }
    }

    private static void printWordsOfLength(int l)
    {
        System.out.println("Words printed with the given length: "+l);
        boolean wordIsValid = true;

        for (int i = 0; i < text.length; i++)
        {
            for (String s:text[i])
            {
                if (s.length() == l)
                {
                    for (int j = 0; j < s.length(); j++)
                    {
                        char c = s.charAt(j);
                        if (c == '.' || c == ',')
                        {
                            wordIsValid = false;
                        }
                    }
                    if (wordIsValid)
                    {
                        System.out.println(s);
                    }
                }
            }
        }

    }

    private static void printWordsStartingWith(String pattern)
    {
        System.out.println("Here is a list of words starting with : "+pattern);
        for (int i = 0; i < text.length; i++)
        {
            for (String s:text[i])
            {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
                {
                    System.out.println(s);
                }
            }
        }
    }


}
