import java.util.Scanner;

public class HW03_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenN;
		int count;
		int sum;
		
		Scanner aScanner;
		aScanner = new Scanner(System.in);
		
		System.out.println("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N ���� �Է��Ͻʽÿ� : ");
		
		givenN = aScanner.nextInt();

		
		sum = 0;
		count = 1;
		
		while(count<=givenN)
		{
			sum=sum+count;
			System.out.println("1���� "+ count + "������ ���� "+ sum + "�Դϴ�.");
			count=count+1;
		}
		
		aScanner.close();
	}

}
