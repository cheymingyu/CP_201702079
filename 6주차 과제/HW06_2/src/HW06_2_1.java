public class HW06_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree = 1;
		double radian, sineValue;
		int numberOfAsterisks;

		while(degree <= 180)
		{
			radian = ((double) degree / 180.0)*3.141592;
			sineValue = Math.sin(radian);
			numberOfAsterisks = (int)((sineValue * 40.0) + 0.5);
			if(degree < 10)
			{
				System.out.print("sine(00" + degree + "µµ) : ");
			}
			else if (degree < 100)
			{
				System.out.print("sine(0" + degree + "µµ) : ");
			}
			else
			{
				System.out.print("sine(" + degree + "µµ) : ");
			}
			printAsterisks(numberOfAsterisks);
			degree = degree + 5;
		}
	}
	
	private static void printAsterisks (int n) {
		int k = 0;
		
		if (n >= 0)
		{
			while(k < n)
			{
				System.out.print("*");
				k = k + 1;
			}
		}
		else
		{
			
		}
		System.out.println("");
	}

}
