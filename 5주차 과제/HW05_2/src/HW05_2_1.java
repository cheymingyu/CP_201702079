
public class HW05_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		double x;
		double y;
		double radian;
		
		while(n <= 180)
		{
			x = (double)n;
			radian = x * (3.141592 / 180.0);
			y = Math.sin(radian);
			
			System.out.println("Sine(" + n + "도) 는 " + y + "입니다.");
			
			n = n + 1;
		}

	}

}
