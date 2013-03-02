
public class ProjectEuler7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find the 1001st prime number
		
		int[] primes = new int[10001];
		int primeIndex = 0;
		
		primes[primeIndex] = 2;
		primeIndex++;
		primes[primeIndex] = 3;
		primeIndex++;
		
		int value = 5;
		int pos = 10001;
		while (primeIndex < pos)
		{
			boolean isPrime = true;
			for (int i = 0; i < primeIndex; i++)
			{
				if (value % primes[i] == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				//System.out.println(value);
				primes[primeIndex] = value;
				primeIndex++;
			}
			value += 2;
		}
		
		String formattedString = String.format("The number %d prime number is %d\n", pos, primes[pos-1]);
		System.out.println(formattedString);

	}

}
