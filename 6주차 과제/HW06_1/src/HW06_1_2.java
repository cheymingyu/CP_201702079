import java.util.Scanner;

public class HW06_1_2 {

	private static Scanner ascanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfAsterisks;
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		System.out.println("");
		
		numberOfAsterisks = inputNumber();
		
		while(numberOfAsterisks >= 0)
		{
			printAsterisks(numberOfAsterisks);
			
			numberOfAsterisks = inputNumber();
		}
		
		System.out.println("");
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
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
	
	private static int inputNumber () {
		ascanner = new Scanner(System.in);
		int d;
		
		System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
		d = ascanner.nextInt();

		return d;

	}

}
