import java.util.Scanner;

public class HW05_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score;
		
		System.out.print("������ �Է��ϼ��� : ");
		score = scanner.nextInt();
		
		while(score >= 0)
		{
			if(score > 100)
			{
				System.out.println("���� : �ִ����� 100�� �Ѿ����ϴ�.");
			}
			else
			{
				
			}
			System.out.print("������ �Է��ϼ��� : ");
			score = scanner.nextInt();
		}
		
		scanner.close();
	}

}
