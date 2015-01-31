import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class JUnit_Tests 
{
	InterviewQuestions Questions = new InterviewQuestions();
	
	@Test
	public void isapalindrometest() 
	{
		assertEquals(true, Questions.isapalindrome("racecar"));
		assertEquals(false,Questions.isapalindrome("bookstore"));
	}

	@Test
	public void removaltest() 
	{
		assertEquals("Remved", Questions.removechar(3, "Removed"));
	}
	
	@Test
	public void numChars()
	{
		assertEquals(4,Questions.numChars("Seventeen", 'e'));
	}
	
	@Test
	public void StringtoNum()
	{
		assertEquals(12345, Questions.StringtoNum("12345"));
	}
	
	@Test
	public void isanAnagram()
	{
		assertTrue(Questions.isanAnagram("angel","glean"));
		assertFalse(Questions.isanAnagram("anagram", "notone"));
		
	}
	
	@Test
	public void FindMax()
	{
		int[] array = {1,3,4,9,8,10};
		assertEquals(9,Questions.FindSecondMax(array));
	}
	
	@Test
	public void RverseString()
	{
		assertEquals("desreveR",Questions.ReverseString("Reversed"));
	}
	
	@Test
	public void Fibonacci()
	{
		assertEquals(55,Questions.FibonacciIterate(10));
	}
	
	@Test
	public void Fibonacci2()
	{
		assertEquals(610,Questions.FibonacciRecurse(15));
	}
	
	@Test
	public void WordSearch() throws FileNotFoundException
	{
		assertEquals(10,Questions.HowManyWords("the"));
	}
}
