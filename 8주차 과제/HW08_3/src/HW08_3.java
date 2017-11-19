import java.util.Scanner;

public class HW08_3 {
	
	private static final int MAX_SIZE = 100;
	
	private static Scanner scanner = new Scanner(System.in) ;
	
	private static int inputScore () {
		int score;
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores_Kor = new int[MAX_SIZE];
		int[] scores_Computer = new int[MAX_SIZE];
		double[] average_Student = new double[MAX_SIZE];
		double average_Class;
		int numberOfStudents = 0;
		int realScore_Kor;
		int realScore_Computer;
		double sumOfAverage = 0;
		int numberOfOverAverage =0;
		
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		realScore_Kor = inputScore();
		realScore_Computer = inputScore();
		
		while ((realScore_Kor >= 0) && (realScore_Computer >= 0))
		{
			if ((realScore_Kor > 100) || (realScore_Computer > 100))
			{
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else
			{
				scores_Kor[numberOfStudents] = realScore_Kor;
				scores_Computer[numberOfStudents] = realScore_Computer;
				average_Student[numberOfStudents] = ((double) scores_Kor[numberOfStudents] + (double) scores_Computer[numberOfStudents]) / 2.0;
				numberOfStudents ++;
			}
			System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			realScore_Kor = inputScore();
			realScore_Computer = inputScore();
		}
		
		int i = 0;
		while (i < numberOfStudents)
		{
			sumOfAverage = sumOfAverage + average_Student[i];
			i ++;
		}
		
		average_Class = sumOfAverage / (double) numberOfStudents;
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
		System.out.println("");

		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		
		int j = 0;
		while (j < numberOfStudents)
		{
			System.out.println("[" + j + "] " + scores_Kor[j] + " " + scores_Computer[j] + "(��� " + average_Student[j] + ")");
			if (average_Student[j] >= average_Class)
			{
				numberOfOverAverage ++;
			}
			j ++;
		}
		System.out.println("");
		System.out.println("�б� ����� " + average_Class + " �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� " + numberOfOverAverage + " �� �Դϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
