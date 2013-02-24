
public class ProjectEuler2 {
	
	public static int sumOfFibonacci(int prev1, int prev2)
	{
		int current = prev1 + prev2;
		if ( current > 4000000)
			return 0;
		
		if (current % 2 != 0)
			return sumOfFibonacci(prev2, current);
		else
			return current + sumOfFibonacci(prev2, current);
	}

	/**
	 * Main
	 */
	public static void main(String[] args) {
		// Sum of the even-valued terms

		int sum = sumOfFibonacci(0, 1);
		
		String formattedString = String.format("The sum of the even valued Fibonacci numbers less than 4 mil is %d", sum);
		System.out.println(formattedString);
	}

}
