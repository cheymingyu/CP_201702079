import java.util.Scanner;

public class HW04_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char userAnswer;
		
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ� : ");
		
		userAnswer = scanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y')
		{
			System.out.println("������������ ����մϴ�!");
			
			System.out.println("������������ Ǯ�ڽ��ϱ�?");
			System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ� : ");
			
			userAnswer = scanner.next().charAt(0);
		}
		System.out.println("���������� Ǯ�̸� �����մϴ�.");
		scanner.close();
	}

}
