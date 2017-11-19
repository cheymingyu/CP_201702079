import java.util.Scanner;

public class HW07_3 {

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
	
	public static double grade2Point (char aGrade) {
		if (aGrade == 'A')
		{
			return 4.0;
		}
		else if (aGrade == 'B')
		{
			return 3.0;
		}
		else if (aGrade == 'C')
		{
			return 2.0;
		}
		else if (aGrade == 'D')
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanScore;
		int englishScore;
		int computerScore;
		
		System.out.println("<<<���� ó�� ���α׷��� �����մϴ�>>>");
		
		System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
		koreanScore = inputScore();
		englishScore = inputScore();
		computerScore = inputScore();
		
		while ( (koreanScore >= 0) && (englishScore >= 0) && (computerScore >= 0) )
		{
			if ( (koreanScore > 100) || (englishScore > 100) || (computerScore > 100) )
			{
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else
			{
				char koreanGrade = score2Grade (koreanScore);
				char englishGrade = score2Grade (englishScore);
				char computerGrade = score2Grade (computerScore);
				
				double koreanPoint = grade2Point (koreanGrade);
				double englishPoint = grade2Point (englishGrade);
				double computerPoint = grade2Point (computerGrade);
				
				System.out.println("[��   ��] ���� : " + koreanScore + "  ���� : " + koreanGrade + "  ���� : " + koreanPoint);
				System.out.println("[��   ��] ���� : " + englishScore + "  ���� : " + englishGrade + "  ���� : " + englishPoint);
				System.out.println("[��ǻ��] ���� : " + computerScore + "  ���� : " + computerGrade + "  ���� : " + computerPoint);
			}
			System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("<<<���� ó�� ���α׷��� �����մϴ�>>>");
	}

}
