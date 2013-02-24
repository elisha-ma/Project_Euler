public class ProjectEuler3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Largest prime factor of the number 600851475143
		
		long target = 600851475143L;
		//long target = 13195;
		long value = (long) Math.floor((Math.sqrt(target)));
		
		long last = 3;
		long lastPrime = 3;
		
		while (last < value)
		{
			if (target % last == 0)
			{
				target /= last;
				lastPrime = last;
			}
			else
			{
				last += 2;
			}
		}
		
		String formattedString = String.format("The largest prime factor is %d", lastPrime);
		System.out.println(formattedString);
		
	}

}
