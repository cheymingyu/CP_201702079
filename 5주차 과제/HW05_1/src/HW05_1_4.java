import java.util.Scanner;

public class HW05_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score;
		int numberOfStudents = 0;
		int sumOfScores = 0;
		double avg;
		char grade;
		int numberOfA = 0;
		int numberOfB = 0;
		int numberOfC = 0;
		int numberOfD = 0;
		int numberOfF = 0;


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
					numberOfA = numberOfA + 1;
				}
				else if(score >= 80 && score <= 89)
				{
					grade = 'B';
					numberOfB = numberOfB + 1;
				}
				else if(score >= 70 && score <= 79)
				{
					grade = 'C';
					numberOfC = numberOfC + 1;
				}
				else if(score >= 60 && score <= 69)
				{
					grade = 'D';
					numberOfD = numberOfD + 1;
				}
				else
				{
					grade = 'F';
					numberOfF = numberOfF + 1;
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
		System.out.println("A�� " + numberOfA + "�� �Դϴ�.");
		System.out.println("B�� " + numberOfB + "�� �Դϴ�.");
		System.out.println("C�� " + numberOfC + "�� �Դϴ�.");
		System.out.println("D�� " + numberOfD + "�� �Դϴ�.");
		System.out.println("F�� " + numberOfF + "�� �Դϴ�.");
		System.out.println("����� " + avg + "�Դϴ�.");
		System.out.println("");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		scanner.close();
	}

}
