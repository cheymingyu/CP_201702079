import java.util.Scanner;

public class HW05_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score;
		int numberOfStudents = 0;
		int sumOfScores = 0;
		double avg;
		
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		
		System.out.print("������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
		
		while(score >= 0)
		{
			if(score > 100)
			{
				System.out.println("���� : �ִ����� 100�� �Ѿ����ϴ�.");
			}
			else
			{
				numberOfStudents = numberOfStudents + 1;
				sumOfScores = sumOfScores + score;
			}
			System.out.print("������ �Է��Ͻÿ� : ");
			score = scanner.nextInt();
		}
		avg = (double) sumOfScores / (double) numberOfStudents ;
		
		System.out.println("");
		System.out.println("�л����� " + numberOfStudents + "���Դϴ�.");
		System.out.println("����� " + avg + "�Դϴ�.");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		scanner.close();
	}

}
