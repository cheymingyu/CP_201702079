import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore () {
		int score;
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = null;
		student = new Student();
		GPACounter gpaCounter = null;
		gpaCounter = new GPACounter();
		
		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;
		System.out.print("> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��Ͻÿ� : ");
		aScoreKorean = inputScore();
		aScoreEnglish = inputScore();
		aScoreComputer = inputScore();
		
		while ((aScoreKorean >= 0) && (aScoreEnglish >= 0) && (aScoreComputer >= 0))
		{
			if ((aScoreKorean > 100) || (aScoreEnglish > 100) || (aScoreComputer > 100))
			{
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else
			{
				student.setScoreKorean(aScoreKorean);
				student.setScoreEnglish(aScoreEnglish);
				student.setScoreComputer(aScoreComputer);
				
				System.out.println("[��   ��] ���� : " + student.scoreKorean() + ", ���� : " + student.gradeKorean() + ",���� : " + student.pointKorean());
				System.out.println("[��   ��] ���� : " + student.scoreEnglish() + ", ���� : " + student.gradeEnglish()+ ",���� : " + student.pointEnglish());
				System.out.println("[��ǻ��] ���� : " + student.scoreComputer() + ", ���� : " + student.gradeComputer()+ ",���� : " + student.pointComputer());
				System.out.println("�� �л��� ��������� " + student.gpa() + " �Դϴ�.");
				gpaCounter.count(student.gpa());
			}
			System.out.print("> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��Ͻÿ� : ");
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��������� 3.0 �̻��� �л��� " + gpaCounter.numberOfGPA3() + " ���Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� " + gpaCounter.numberOfGPA2() + " ���Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� " + gpaCounter.numberOfGPA1() + " ���Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� " + gpaCounter.numberOfGPA0() + " ���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
