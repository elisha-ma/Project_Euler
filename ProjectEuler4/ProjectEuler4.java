
public class ProjectEuler4 {
	
	public static boolean checkIfPalindrome(String value)
	{
		int strLength = value.length();
		char leastSigDigit = value.charAt(strLength-1);
		char mostSigDigit = value.charAt(0);
		
		if (leastSigDigit == mostSigDigit)
		{
			if (strLength == 2 || strLength == 3)
				return true;
			else
				return checkIfPalindrome(value.substring(1,strLength-1));
		}
		else
			return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find largest palindrome made from the product of two 3-digit numbers
		int i=999, j=999;
		
		int largest = 0;
		for (i = 999; i >=100; i--)
		{
			for (j = i; j >= 100; j--)
			{
				if (checkIfPalindrome(Integer.toString(i*j)))
				{
					if (largest < i*j)
						largest = i*j;
				}
			}
		}
		
		String formattedString = String.format("The largest palindrome was %d\n", largest);
		
		System.out.println(formattedString);

	}

}
