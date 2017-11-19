import java.util.Scanner;

public class HW08_2 {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in);
	
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
		int sumOfScores = 0;
		double average;
		int numberOfOverAverage =0;
		
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
				sumOfScores = sumOfScores + scores[numberOfStudents];
				numberOfStudents ++;
			}
			realScore = inputScore();
		}
		
		average = (double) sumOfScores / (double) numberOfStudents;
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� " + average + " �Դϴ�.");
		
		System.out.println("");
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		
		int i = 0;
		while (i < numberOfStudents)
		{
			if ((double) scores[i] >= average)
			{
				System.out.println("[" + i + "] " + scores[i] + " (��� �̻��Դϴ�)");
				numberOfOverAverage ++;
			}
			else
			{
				System.out.println("[" + i + "] " + scores[i] + " (��� �̸��Դϴ�)");
			}
			i ++;
		}
		System.out.println("��� �̻��� �л��� ���� " + numberOfOverAverage + " �Դϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
