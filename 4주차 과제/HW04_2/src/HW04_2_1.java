
public class HW04_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact, num, givenN;
		
		fact = 1;
		givenN = 5;
		
		num = 2;
		
		if(givenN==0)
			fact = 1;
		else
		{
			while(num<=givenN)
			{
				fact = fact * num;
				num = num + 1;
			}
		}
		System.out.println(givenN + "! = " + fact);
	}

}
