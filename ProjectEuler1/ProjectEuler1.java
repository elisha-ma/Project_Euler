
public class ProjectEuler1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find the sum of all multiples of 3 and 5 under 1000
		int sum = 0;
		for (int i = 3; i < 1000; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		
		String formattedString = String.format("The sum of all multiples of 3 and 5 under 1000 is %d\n", sum);
		System.out.println(formattedString);

	}

}
