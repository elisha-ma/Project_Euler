

public class ProjectEuler11 {

	public static int findMax(int a, int b, int c, int d)
	{
		if(a >= b && a >= c && a >= d)
			return a;
		else if(b>=a && b>=c && b >= d)
			return b;
		else if(c >=a && c>=b && c>=d)
			return c;
		else
			return d;
	}
	/**
	 *, @param, args
	 */
	public static void main(String[] args) {
		//, Largest, product, in, a, grid
		
		
		int[][] grid = {
				{8, 2, 22, 97, 38, 15, 0, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91, 8},
				{49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 0},
				{81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65},
				{52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 02, 36, 91},
				{22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
				{24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
				{32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
				{67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
				{24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
				{21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
				{78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
				{16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
				{86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
				{19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
				{04, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
				{88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
				{04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
				{20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
				{20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
				{1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
		}; 
		
		//int[][] grid = { {0, 0, 0, 9}, {0 , 0, 9, 0}, {0, 9, 0, 0}, {9, 0, 0, 0} };
		int size = 20;
		int largestProduct = 0;
		int productHor, productVer, productDiag, productDiagBack;
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				int a = grid[i][j];
				try
				{
					int b1 = grid[i][j+1];
					int c1 = grid[i][j+2];
					int d1 = grid[i][j+3];
				
					productHor = a*b1*c1*d1;
				} 
				catch ( ArrayIndexOutOfBoundsException e)
				{
					productHor = 0;
				}
				
				try
				{
					int b2 = grid[i+1][j];
					int c2 = grid[i+2][j];
					int d2 = grid[i+3][j];
				
					productVer = a*b2*c2*d2;
				} catch ( ArrayIndexOutOfBoundsException e)
				{
					productVer = 0;
				}
				
				try
				{
					int b3 = grid[i+1][j+1];
					int c3 = grid[i+2][j+2];
					int d3 = grid[i+3][j+3];
				
					productDiag = a*b3*c3*d3;
				} catch( ArrayIndexOutOfBoundsException e)
				{
					productDiag = 0;
				}
				
				try
				{
					int b4 = grid[i-1][j+1];
					int c4 = grid[i-2][j+2];
					int d4 = grid[i-3][j+3];
					
					productDiagBack = a*b4*c4*d4;
				} catch( ArrayIndexOutOfBoundsException e)
				{
					productDiagBack = 0;
				}
				
				int max = findMax(productHor, productVer, productDiag, productDiagBack);
				
				if(max > largestProduct)
					largestProduct = max;
			}
		}
		
		String formattedString = String.format("The largest product is %d\n", largestProduct);
		System.out.println(formattedString);

	}

}
