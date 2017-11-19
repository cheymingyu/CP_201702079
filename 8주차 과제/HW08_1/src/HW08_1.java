import java.util.Scanner;

public class HW08_1 {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in) ;
	
	private static int inputScore () {
		int score;
		System.out.print(">������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents = 0;
		int realScore;
		
		realScore = inputScore();
		
		while (realScore >= 0)
		{
			if (realScore > 100)
			{
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else
			{
				scores[numberOfStudents] = realScore;
				numberOfStudents ++;
			}
			realScore = inputScore();
		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
		
		System.out.println("");
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		
		int i = 0;
		while (i < numberOfStudents)
		{
			System.out.println("[" + i + "] " + scores[i] );
			i ++;
		}
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
