import java.util.Scanner;

public class HW07_1 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static int inputScore () {
		System.out.print("-������ �Է��Ͻÿ� : ");
		int score = scanner.nextInt();
		return score;
	}
	
	public static char score2Grade (int aScore) {
		if (aScore >= 90)
		{
			return 'A';
		}
		else if (aScore >= 80)
		{
			return 'B';
		}
		else if (aScore >= 70)
		{
			return 'C';
		}
		else if (aScore >= 60)
		{
			return 'D';
		}
		
		else
		{
			return 'F';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int realScore;
		int numberOfA = 0;
		int numberOfB = 0;
		int numberOfC = 0;
		int numberOfD = 0;
		int numberOfF = 0;
		
		System.out.println("<<<���� ó�� ���α׷��� �����մϴ�>>>");
		
		realScore = inputScore();
		
		while (realScore >= 0)
		{
			if (realScore > 100)
			{
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else
			{
				char grade = score2Grade (realScore);
				if (realScore >= 90)
				{
					numberOfA = numberOfA + 1;
				}
				else if (realScore >= 80)
				{
					numberOfB = numberOfB + 1;
				}
				else if (realScore >= 70)
				{
					numberOfC = numberOfC + 1;
				}
				else if (realScore >= 60)
				{
					numberOfD = numberOfD + 1;
				}
				
				else
				{
					numberOfF = numberOfF + 1;
				}
				System.out.println("���� : " + realScore + "  ���� : " + grade);
			}
			realScore = inputScore();
		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");

		System.out.println("A�� " + numberOfA + "�� �Դϴ�.");
		System.out.println("B�� " + numberOfB + "�� �Դϴ�.");
		System.out.println("C�� " + numberOfC + "�� �Դϴ�.");
		System.out.println("D�� " + numberOfD + "�� �Դϴ�.");
		System.out.println("F�� " + numberOfF + "�� �Դϴ�.");
		
		System.out.println("");
		System.out.println("<<<���� ó�� ���α׷��� �����մϴ�>>>");
	}

}
