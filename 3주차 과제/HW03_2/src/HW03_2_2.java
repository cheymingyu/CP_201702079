import java.util.Scanner;

public class HW03_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenN;
		int count;
		int sum;
		
		Scanner aScanner;
		aScanner = new Scanner(System.in);
		
		System.out.println("1부터 N까지 합계를 구하려고 합니다. N 값을 입력하십시오 : ");
		
		givenN = aScanner.nextInt();

		
		sum = 0;
		count = 1;
		
		while(count<=givenN)
		{
			sum=sum+count;
			System.out.println("1부터 "+ count + "까지의 합은 "+ sum + "입니다.");
			count=count+1;
		}
		
		aScanner.close();
	}

}
