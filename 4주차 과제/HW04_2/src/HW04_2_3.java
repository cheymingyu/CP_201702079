import java.util.Scanner;

public class HW04_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner ascanner = new Scanner(System.in);
		
		int fact, num, givenN;
		char userAnswer;
		
		fact = 1;
		num = 2;
		
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
				if(givenN == 0)
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
			System.out.println("Factorial�� ����Ͻðڽ��ϱ�?");
			System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ�: ");
			
			userAnswer = ascanner.next().charAt(0);
		}
		
		System.out.println("����� �����մϴ�.");
		scanner.close();
		ascanner.close();
	}

}
