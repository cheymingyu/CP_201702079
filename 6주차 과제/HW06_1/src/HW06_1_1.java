import java.util.Scanner;

public class HW06_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numberOfAsterisks;
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		System.out.println("");
		
		System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
		numberOfAsterisks = scanner.nextInt();
		
		while(numberOfAsterisks >= 0)
		{
			printAsterisks(numberOfAsterisks);
			
			System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
			numberOfAsterisks = scanner.nextInt();
		}
		
		System.out.println("");
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		
		scanner.close();
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
