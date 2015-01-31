import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;


public class InterviewQuestions 
{
	public boolean isapalindrome(String palindrome)
	{
		Stack<Character> backwards = new Stack<Character>();
		char[] charArray = palindrome.toCharArray();
		char top;
		for(int i = 0; i < charArray.length; i++)
			backwards.push(charArray[i]);
		
		for(int j = 0; j < charArray.length;j++)
		{
			top = (Character) backwards.peek();
			if(top != charArray[j])
				return false;
			else
				backwards.pop();
		}
		return true;
	}
	
	public String removechar(int position, String Word)
	{
		String removed = new String();
		char[] charArray = Word.toCharArray();

		for(int i = 0; i < charArray.length; i++)
		{
			if(i != position)
				removed += charArray[i];
		}
		
		return removed;
	}

	public int numChars(String string, char c) 
	{
		int number = 0;
		
		for(int i = 0; i < string.length(); i++)
			if(string.charAt(i) == c)
				number++;
		return number;
	}

	public int StringtoNum(String string) 
	{
		int number = 0;
		for(int i = 0; i < string.length(); i++)
			number += (((int)string.charAt(i) - '0') * Math.pow(10, string.length() - (i+1)));
		return number;
	}

	public boolean isanAnagram(String string, String string2) 
	{
		int value1 = 0,value2 = 0;
		
		for(int i = 0; i < string.length(); i++)
			value1 += string.charAt(i);
		for(int j  = 0; j < string2.length(); j++)
			value2 += string2.charAt(j);
		if(value1 == value2)
			return true;
		else
			return false;
	}

	public int FindSecondMax(int[] array) 
	{
		int number1 = 0, number2 = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] > number1)
				number1 = array[i];
		for(int j = 0; j < array.length; j++)
			if(array[j] > number2 && array[j] != number1)
				number2 = array[j];

		return number2;
	}

	public String ReverseString(String string) 
	{
		String reverse = "";
		Stack<Character> backwards = new Stack<Character>();

		for(int i = 0; i < string.length(); i++)
			backwards.push(string.charAt(i));
		
		while(!backwards.empty())
			reverse += backwards.pop();
		
		return reverse;
	}

	public int FibonacciIterate(int position) 
	{
		int result = 0, start = 1;
		
		for(int i = 0; i < position/2; i++)
		{
			System.out.println(result + "," + start);
			result += start;
			start += result;
		}
		if(position%2 == 0)
			return result;
		else
			return start;
	}
	
	
	public int FibonacciRecurse(int position) 
	{
		if(position == 0)
			return 0;
		else if (position == 1)
			return 1;
		else
			return FibonacciRecurse(position-2)+FibonacciRecurse(position-1);
	}

	public int HowManyWords(String string) throws FileNotFoundException 
	{
		int WordCount = 0;
		File file = new File("CountMe.txt");
	    Scanner scanner = new Scanner(file);

	    while(scanner.hasNext()){
	        String[] tokens = scanner.nextLine().split(" ");
	        for(int i = 0; i < tokens.length; i++)
	        	if(tokens[i].toLowerCase().equals(string))
	        		WordCount++;
	    }
	    scanner.close();
		return WordCount;
	}
	
}
