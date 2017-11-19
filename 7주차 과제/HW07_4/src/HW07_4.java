import java.util.Scanner;

public class HW07_4 {

public static Scanner scanner = new Scanner(System.in);
	
	public static int inputScore () {
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
	
	public static double calcGPA (double point_Korean, double point_English, double point_Computer) {
		return (point_Korean + point_English + point_Computer)/3.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanScore;
		int englishScore;
		int computerScore;
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		System.out.println("<<<���� ó�� ���α׷��� �����մϴ�>>>");
		
		System.out.print("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
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
				
				double GPA = calcGPA (koreanPoint, englishPoint, computerPoint);
				
				System.out.println("�� �л��� ��������� " + GPA + "�Դϴ�.");
				if (GPA >= 4.0)
				{
					count4 = count4 + 1;
				}
				else if(GPA >= 3.0)
				{
					count3 = count3 + 1;
				}
				else if(GPA >= 2.0)
				{
					count2 = count2 + 1;
				}
				else if(GPA >= 1.0)
				{
					count1 = count1 + 1;
				}
				else
				{
					count0 = count0 + 1;
				}
			}
			System.out.print("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		
		System.out.println("��������� 4.0 �̻��� �л��� " + count4 + "�� �Դϴ�.");
		System.out.println("��������� 3.0 �̻� 4.0 �̸��� �л��� " + count3 + "�� �Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� " + count2 + "�� �Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� " + count1 + "�� �Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� " + count0 + "�� �Դϴ�.");
		
		System.out.println("");
		System.out.println("<<<���� ó�� ���α׷��� �����մϴ�>>>");
	}

}
