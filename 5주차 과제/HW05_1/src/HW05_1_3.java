import java.util.Scanner;

public class HW05_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score;
		int numberOfStudents = 0;
		int sumOfScores = 0;
		double avg;
		char grade;

		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		System.out.println("");
		System.out.print("������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
	
		while(score >= 0)
		{
			if(score > 100)
			{
				System.out.println("���� : �ִ����� 100�� �Ѿ����ϴ�.");
				System.out.println("");
			}
			else
			{
				if(score >= 90 && score <= 100)
				{
					grade = 'A';
				}
				else if(score >= 80 && score <= 89)
				{
					grade = 'B';
				}
				else if(score >= 70 && score <= 79)
				{
					grade = 'C';
				}
				else if(score >= 60 && score <= 69)
				{
					grade = 'D';
				}
				else
				{
					grade = 'F';
				}
				
				System.out.println(" (���� : " + score + ", ���� : " + grade + ")");
				
				numberOfStudents = numberOfStudents + 1;
				sumOfScores = sumOfScores + score;
			}
			System.out.print("������ �Է��Ͻÿ� : ");
			score = scanner.nextInt();
		}
		avg = (double) sumOfScores / (double) numberOfStudents ;
		
		System.out.println("");
		System.out.println("�л����� " + numberOfStudents + "�� �Դϴ�.");
		System.out.println("����� " + avg + "�Դϴ�.");
		System.out.println("");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		scanner.close();
	}

}
