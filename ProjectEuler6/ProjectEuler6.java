
public class ProjectEuler6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find the difference between the sum of the squares of the first 100 natural numbers and the square of the sum
		
		int sumOfSquare = 0;
		int sum = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			sum += i;
			sumOfSquare += Math.pow(i, 2);
		}
		
		int difference = (int) (Math.pow(sum,2) - sumOfSquare);
		
		String formattedString = String.format("The difference is %d\n", difference);
		System.out.println(formattedString);

	}

}
