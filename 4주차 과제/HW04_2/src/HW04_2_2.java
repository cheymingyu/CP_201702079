import java.util.Scanner;

public class HW04_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner ascanner = new Scanner(System.in);
		
		int givenN;
		char userAnswer;
		
		System.out.println("Factorial�� ����Ͻðڽ��ϱ�?");
		System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ�: ");
		
		userAnswer = ascanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y')
		{
			System.out.print("������ �Է��Ͻÿ� : ");
			
			givenN = scanner.nextInt();
		
			if(givenN < 0)
				System.out.println("�Է°��� �����̹Ƿ�, Factorial ���� ����� �� �����ϴ�.");
			else
			{
				System.out.println(givenN + " Factorial ���� ����Ϸ��� �մϴ�.");
			}
			System.out.println("Factorial�� ����Ͻðڽ��ϱ�?");
			System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ�: ");
			
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("����� �����մϴ�.");
		scanner.close();
		ascanner.close();
	}

}
