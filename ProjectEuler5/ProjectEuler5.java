
public class ProjectEuler5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find smallest positive number that is evenly divisible by 1-20
		
		int[] primeFactors = {2,3,5,7,11,13,17,19};
		int[] factors = new int[21];
		
		int[] curFactors = new int[21];
		
		for (int i = 1; i <= 20; i++)
		{
			int val = i;
			int index = 0;
			while (val > 1)
			{
				if (val % primeFactors[index] == 0)
				{
					val /= primeFactors[index];
					curFactors[primeFactors[index]]++;
				}
				else
				{
					index++;
				}
			}
			
			for (int j = 0; j <= 20; j++)
			{
				if (curFactors[j] > factors[j])
					factors[j] = curFactors[j];
			}
			curFactors = new int[21];
		}
		
		int target = 1;
		for (int i = 1; i <= 20; i++)
		{
			if (factors[i] != 0)
				target *= Math.pow(i,factors[i]);
		}
		
		// sanity check
		for (int i = 1; i <=20; i++)
		{
			if (target % i != 0)
				System.out.println("gah!\n");
		}
		
		String formattedString = String.format("The smallest number is %d\n", target);
		System.out.println(formattedString);

	}

}
